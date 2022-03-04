package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarString;

public interface Resource extends IdentifiableSystemScalarString {

	String getActivityIdentifier();
	Resource setActivityIdentifier(String activityIdentifier);
	
	String getEconomicNatureIdentifier();
	Resource setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	Revenue getRevenue();
	Resource setRevenue(Revenue revenue);
	
	LegislativeActVersion getActVersion();
	Resource setActVersion(LegislativeActVersion actVersion);
	
	String NAME = "Ressource";
	String NAME_PLURAL = "Ressources";	
}