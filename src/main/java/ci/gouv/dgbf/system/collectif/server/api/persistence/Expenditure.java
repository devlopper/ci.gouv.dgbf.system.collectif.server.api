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
	
	BudgetaryActVersion getBudgetaryActVersion();
	Expenditure setBudgetaryActVersion(BudgetaryActVersion budgetaryActVersion);
	
	String PROPERTY_AS_STRINGS = "asstrings";
	String PROPERTY_AMOUNTS = "amounts";
}