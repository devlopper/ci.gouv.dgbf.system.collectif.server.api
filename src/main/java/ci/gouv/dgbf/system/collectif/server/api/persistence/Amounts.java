package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.__kernel__.number.NumberHelper;

public interface Amounts {

	Long getInitial();
	Amounts setInitial(Long initial);
	
	Long getMovement();
	Amounts setMovement(Long movement);
	
	Long getMovementIncluded();
	Amounts setMovementIncluded(Long movementIncluded);
	
	Long getActual();
	Amounts setActual(Long actual);
	
	Long getActualMinusMovementIncluded();
	Amounts setActualMinusMovementIncluded(Long actualMinusMovementIncluded);
	
	Long getActualPlusAdjustment();
	Amounts setActualPlusAdjustment(Long actualPlusAdjustment);
	
	Long getAvailable();
	Amounts setAvailable(Long available);
	
	Long getAdjustment();
	Amounts setAdjustment(Long adjustment);
	
	Long getActualMinusMovementIncludedPlusAdjustment();
	Amounts setActualMinusMovementIncludedPlusAdjustment(Long actualMinusMovementIncludedPlusAdjustment);
	
	public default Amounts setZero() {
		setInitial(0l);
		setActual(0l);
		setMovement(0l);
		setAdjustment(0l);
		setActualPlusAdjustment(0l);
		setAvailable(0l);
		return this;
	}
	
	public default Amounts computeMovement() {
		setMovement(NumberHelper.getLong(NumberHelper.subtract(getActual(),getInitial())));
		return this;
	}
	
	public default Amounts computeActualPlusAdjustment() {
		setActualPlusAdjustment(NumberHelper.getLong(NumberHelper.add(getActual(),getAdjustment())));
		return this;
	}
	
	public default Amounts computeActualMinusMovementIncludedPlusAdjustment() {
		setActualMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.subtract(getActualPlusAdjustment(),getMovementIncluded())));
		return this;
	}
	
	public default Amounts copy(Object[] array,Integer index) {
		setInitial(NumberHelper.getLong(array[index++],0l));
		setActual(NumberHelper.getLong(array[index++],0l));
		computeMovement();
		setAdjustment(NumberHelper.getLong(array[index++],0l));
		computeActualPlusAdjustment();
		setAvailable(NumberHelper.getLong(array[index++],0l));
		return this;
	}
	
	public default Amounts copy(Object[] array) {
		return copy(array, 1);
	}
}