package ci.gouv.dgbf.system.collectif.server.api.persistence;

public interface Expenditure {

	String getIdentifier();
	Expenditure setIdentifier(String identifier);
	
	String getActivityIdentifier();
	Expenditure setActivityIdentifier(String activityIdentifier);
	
	String getEconomicNatureIdentifier();
	Expenditure setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	String getFundingSourceIdentifier();
	Expenditure setFundingSourceIdentifier(String fundingSourceIdentifier);
	
	String getLessorIdentifier();
	Expenditure setLessorIdentifier(String lessorIdentifier);
	
	EntryAuthorization getEntryAuthorization();
	Expenditure setEntryAuthorization(EntryAuthorization entryAuthorization);
	
	PaymentCredit getPaymentCredit();
	Expenditure setPaymentCredit(PaymentCredit paymentCredit);
	
	LegislativeActVersion getActVersion();
	Expenditure setActVersion(LegislativeActVersion actVersion);
	
	String NAME = "Dépense";
}