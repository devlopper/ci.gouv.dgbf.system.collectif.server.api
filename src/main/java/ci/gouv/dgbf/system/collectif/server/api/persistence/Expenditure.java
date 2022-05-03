package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarString;

public interface Expenditure extends IdentifiableSystemScalarString {

	String getActivityIdentifier();
	Expenditure setActivityIdentifier(String activityIdentifier);
	
	String getActivityCode();
	
	String getEconomicNatureIdentifier();
	Expenditure setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	String getEconomicNatureCode();
	
	String getFundingSourceIdentifier();
	Expenditure setFundingSourceIdentifier(String fundingSourceIdentifier);
	
	String getFundingSourceCode();
	
	String getLessorIdentifier();
	Expenditure setLessorIdentifier(String lessorIdentifier);
	
	String getLessorCode();
	
	Long getEntryAuthorizationAdjustment();
	
	EntryAuthorization getEntryAuthorization();
	Expenditure setEntryAuthorization(EntryAuthorization entryAuthorization);
	
	Long getPaymentCreditAdjustment();
	
	PaymentCredit getPaymentCredit();
	Expenditure setPaymentCredit(PaymentCredit paymentCredit);
	
	LegislativeActVersion getActVersion();
	Expenditure setActVersion(LegislativeActVersion actVersion);
	
	String NAME = "Dépense";
	String NAME_PLURAL = "Dépenses";
}