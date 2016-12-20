package edu.stevens.cs548.clinic.service.representations;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlRootElement;

import edu.stevens.cs548.clinic.domain.PatientFactory;
import edu.stevens.cs548.clinic.service.dto.util.PatientDto;
import edu.stevens.cs548.clinic.service.dto.util.PatientDtoFactory;
import edu.stevens.cs548.clinic.service.web.rest.data.PatientType;
import edu.stevens.cs548.clinic.service.web.rest.data.dap.LinkType;

@XmlRootElement
public class PatientRepresentation extends PatientType {


	final static Logger logger = Logger.getLogger(PatientRepresentation.class.getCanonicalName());
	
	public List<LinkType> getLinksTreatments() {
		return this.getTreatments();
	}
	
	public static LinkType getPatientLink(long id, UriInfo uriInfo) {
		logger.info("INSIDE PATIENT REPRESENTATION : Step 1 : "+uriInfo);
		//logger.info("INSIDE PATIENT REPRESENTATION : Step 1.1 : "+uriInfo.toString());
		
		UriBuilder ub = uriInfo.getBaseUriBuilder();
		ub.path("patient").path("{id}");
		
		//logger.info("INSIDE PATIENT REPRESENTATION : Step 2");
		
		String patientURI = ub.build(Long.toString(id)).toString();

		//logger.info("INSIDE PATIENT REPRESENTATION : Step 3");
		
		LinkType link = new LinkType();
		link.setUrl(patientURI);
		link.setRelation(Representation.RELATION_PATIENT);
		link.setMediaType(Representation.MEDIA_TYPE);
		
		logger.info("INSIDE PATIENT REPRESENTATION Link : "+link);
		
		return link;
	}
	
	private PatientDtoFactory patientDtoFactory;
	
	public PatientRepresentation () {
		super();
		this.patientDtoFactory = new PatientDtoFactory();
	}
	
	public PatientRepresentation (PatientDto dto, UriInfo uriInfo) {
		this();
		
		//logger.info("INSIDE PATIENT REPRESENTATION" + uriInfo);
		
		this.id = getPatientLink(dto.getId(), uriInfo);
		this.patientId =  dto.getPatientId();
		this.name = dto.getName();
		this.dob = dto.getDob();
		
		//logger.info("INSIDE PATIENT REPRESENTATION (after value set: "+this.id.toString());
		
		this.age = PatientFactory.computeAge(dto.getDob());
		/*
		 * Call getTreatments to initialize empty list.
		 */
		List<LinkType> links = this.getTreatments();
		for (long t : dto.getTreatments()) {
			links.add(TreatmentRepresentation.getTreatmentLink(t, uriInfo));
		}
		this.getTreatments().addAll(links);
	}
	
	public PatientDto getPatientDto() {
		PatientDto p = patientDtoFactory.createPatientDto();
		p.setId(Representation.getId(this.id));
		p.setPatientId(this.patientId);
		p.setName(this.name);
		p.setDob(this.dob);
		return p;
	}

}
