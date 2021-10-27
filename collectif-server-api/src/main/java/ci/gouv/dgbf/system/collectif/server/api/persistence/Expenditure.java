package ci.gouv.dgbf.system.collectif.server.api.persistence;

public interface Expenditure {

	String getIdentifier();
	Expenditure setIdentifier(String identifier);
	
	String getActivityIdentifier();
	Expenditure setActivityIdentifier(String activityIdentifier);
	
	String getEconomicNatureIdentifier();
	Expenditure setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	EntryAuthorization getEntryAuthorization();
	Expenditure setEntryAuthorization(EntryAuthorization entryAuthorization);
	
	PaymentCredit getPaymentCredit();
	Expenditure setPaymentCredit(PaymentCredit paymentCredit);
	
	/* Version */
	
	BudgetaryActVersion getBudgetaryActVersion();
	Expenditure setBudgetaryActVersion(BudgetaryActVersion budgetaryActVersion);
}