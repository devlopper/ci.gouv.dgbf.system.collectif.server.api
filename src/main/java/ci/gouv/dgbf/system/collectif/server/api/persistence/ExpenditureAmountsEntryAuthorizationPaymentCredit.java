package ci.gouv.dgbf.system.collectif.server.api.persistence;

public interface ExpenditureAmountsEntryAuthorizationPaymentCredit {

	EntryAuthorization getEntryAuthorization();
	EntryAuthorization getEntryAuthorization(Boolean instantiateIfNull);
	PaymentCredit getPaymentCredit();
	PaymentCredit getPaymentCredit(Boolean instantiateIfNull);
	
	public default ExpenditureAmountsEntryAuthorizationPaymentCredit setZeroEntryAuthorizationPaymentCredit() {
		getEntryAuthorization(Boolean.TRUE).setZero();
		getPaymentCredit(Boolean.TRUE).setZero();
		return this;
	}
	
	public default ExpenditureAmountsEntryAuthorizationPaymentCredit copy(Object[] array) {
		getEntryAuthorization(Boolean.TRUE).copy(array,1);
		getPaymentCredit(Boolean.TRUE).copy(array, 5);
		return this;
	}
	
	public default ExpenditureAmountsEntryAuthorizationPaymentCredit computeActualMinusMovementIncludedPlusAdjustment() {
		getEntryAuthorization(Boolean.TRUE).computeActualMinusMovementIncludedPlusAdjustment();
		getPaymentCredit(Boolean.TRUE).computeActualMinusMovementIncludedPlusAdjustment();
		return this;
	}
}