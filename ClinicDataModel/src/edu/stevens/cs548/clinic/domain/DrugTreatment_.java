package edu.stevens.cs548.clinic.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-10-08T21:04:32.711-0400")
@StaticMetamodel(DrugTreatment.class)
public class DrugTreatment_ extends Treatment_ {
	public static volatile SingularAttribute<DrugTreatment, Long> drugTreatmentId;
	public static volatile SingularAttribute<DrugTreatment, String> drug;
	public static volatile SingularAttribute<DrugTreatment, Float> dosage;
}
