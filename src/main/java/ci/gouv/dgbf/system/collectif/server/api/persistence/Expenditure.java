package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarString;

public interface Expenditure extends IdentifiableSystemScalarString {

	String getActivityIdentifier();
	Expenditure setActivityIdentifier(String activityIdentifier);
	
	String getActivityCode();
	Expenditure setActivityCode(String activityCode);
	
	String getEconomicNatureIdentifier();
	Expenditure setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	String getEconomicNatureCode();
	Expenditure setEconomicNatureCode(String economicNatureCode);
	
	String getFundingSourceIdentifier();
	Expenditure setFundingSourceIdentifier(String fundingSourceIdentifier);
	
	String getFundingSourceCode();
	Expenditure setFundingSourceCode(String fundingSourceCode);
	
	String getLessorIdentifier();
	Expenditure setLessorIdentifier(String lessorIdentifier);
	
	String getLessorCode();
	Expenditure setLessorCode(String lessorCode);
	
	Long getEntryAuthorizationAdjustment();
	
	EntryAuthorization getEntryAuthorization();
	Expenditure setEntryAuthorization(EntryAuthorization entryAuthorization);
	
	Long getPaymentCreditAdjustment();
	
	PaymentCredit getPaymentCredit();
	Expenditure setPaymentCredit(PaymentCredit paymentCredit);
	
	LegislativeActVersion getActVersion();
	Expenditure setActVersion(LegislativeActVersion actVersion);
	
	Boolean getHasUndefined();
	Expenditure setHasUndefined(Boolean value);
	
	Boolean getHasUnknown();
	Expenditure setHasUnknown(Boolean value);
	
	Boolean getIsDuplicate();
	Expenditure setIsDuplicate(Boolean value);
	
	default Boolean isLoadable() {
		return !Boolean.TRUE.equals(getIsDuplicate()) && !Boolean.TRUE.equals(getHasUndefined()) && !Boolean.TRUE.equals(getHasUnknown());
	}
	
	default String getActivityCodeEconomicNatureCodeFundingSourceCodeLessorCode() {
		return getActivityCode()+getEconomicNatureCode()+getFundingSourceCode()+getLessorCode();
	}
	
	String NAME = "Dépense";
	String NAME_PLURAL = "Dépenses";
}