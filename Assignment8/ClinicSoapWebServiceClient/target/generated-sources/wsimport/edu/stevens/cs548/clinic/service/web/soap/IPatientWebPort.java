
package edu.stevens.cs548.clinic.service.web.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import edu.stevens.cs548.clinic.dto.PatientDto;
import edu.stevens.cs548.clinic.dto.TreatmentDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IPatientWebPort", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap")
@XmlSeeAlso({
    edu.stevens.cs548.clinic.dto.ObjectFactory.class,
    edu.stevens.cs548.clinic.service.web.soap.ObjectFactory.class
})
public interface IPatientWebPort {


    /**
     * 
     * @param arg0
     * @return
     *     returns edu.stevens.cs548.clinic.dto.PatientDto
     * @throws PatientServiceExn_Exception
     */
    @WebMethod
    @WebResult(name = "patient-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
    @RequestWrapper(localName = "getPatient", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.GetPatient")
    @ResponseWrapper(localName = "getPatientResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.GetPatientResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatientRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatientResponse", fault = {
        @FaultAction(className = PatientServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatient/Fault/PatientServiceExn")
    })
    public PatientDto getPatient(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws PatientServiceExn_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.stevens.cs548.clinic.dto.PatientDto
     * @throws PatientServiceExn_Exception
     */
    @WebMethod
    @WebResult(name = "patient-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
    @RequestWrapper(localName = "getPatientByPatId", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.GetPatientByPatId")
    @ResponseWrapper(localName = "getPatientByPatIdResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.GetPatientByPatIdResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatientByPatIdRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatientByPatIdResponse", fault = {
        @FaultAction(className = PatientServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/getPatientByPatId/Fault/PatientServiceExn")
    })
    public PatientDto getPatientByPatId(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws PatientServiceExn_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns edu.stevens.cs548.clinic.dto.TreatmentDto
     * @throws PatientNotFoundExn_Exception
     * @throws PatientServiceExn_Exception
     * @throws TreatmentNotFoundExn_Exception
     */
    @WebMethod
    @WebResult(name = "treatment-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
    @RequestWrapper(localName = "patientGetTreatment", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.PatientGetTreatment")
    @ResponseWrapper(localName = "patientGetTreatmentResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.PatientGetTreatmentResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/patientGetTreatmentRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/patientGetTreatmentResponse", fault = {
        @FaultAction(className = PatientNotFoundExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/patientGetTreatment/Fault/PatientNotFoundExn"),
        @FaultAction(className = TreatmentNotFoundExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/patientGetTreatment/Fault/TreatmentNotFoundExn"),
        @FaultAction(className = PatientServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/patientGetTreatment/Fault/PatientServiceExn")
    })
    public TreatmentDto patientGetTreatment(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1)
        throws PatientNotFoundExn_Exception, PatientServiceExn_Exception, TreatmentNotFoundExn_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "siteInfo", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.SiteInfo")
    @ResponseWrapper(localName = "siteInfoResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.SiteInfoResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/siteInfoRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/siteInfoResponse")
    public String siteInfo();

    /**
     * 
     * @param patientDto
     * @return
     *     returns long
     * @throws PatientServiceExn_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPatient", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.AddPatient")
    @ResponseWrapper(localName = "addPatientResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.AddPatientResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/addPatientRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/addPatientResponse", fault = {
        @FaultAction(className = PatientServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IPatientWebPort/addPatient/Fault/PatientServiceExn")
    })
    public long addPatient(
        @WebParam(name = "patient-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
        PatientDto patientDto)
        throws PatientServiceExn_Exception
    ;

}
