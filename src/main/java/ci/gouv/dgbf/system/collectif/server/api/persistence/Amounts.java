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
	
	Long getExpectedAdjustment();
	Amounts setExpectedAdjustment(Long expectedAdjustment);
	
	Long getExpectedAdjustmentMinusAdjustment();
	Amounts setExpectedAdjustmentMinusAdjustment(Long expectedAdjustmentMinusAdjustment);
	
	Long getActualMinusMovementIncludedPlusAdjustment();
	Amounts setActualMinusMovementIncludedPlusAdjustment(Long actualMinusMovementIncludedPlusAdjustment);
	
	Long getAvailableMinusMovementIncludedPlusAdjustment();
	Amounts setAvailableMinusMovementIncludedPlusAdjustment(Long availableMinusMovementIncludedPlusAdjustment);
	
	public default Amounts setZero() {
		setInitial(0l);
		setActual(0l);
		setMovement(0l);
		setAdjustment(0l);
		setActualPlusAdjustment(0l);
		setAvailable(0l);
		
		setExpectedAdjustment(0l);
		setExpectedAdjustmentMinusAdjustment(0l);
		
		return this;
	}
	
	public default Amounts copyMovementIncluded(Amounts amounts) {
		if(amounts == null)
			return this;
		setMovementIncluded(amounts.getMovementIncluded());
		return this;
	}
	
	public default Amounts copyAvailable(Amounts amounts) {
		if(amounts == null)
			return this;
		setAvailable(amounts.getAvailable());
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
		setActualMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(NumberHelper.subtract(getActual(),getMovementIncluded()),getAdjustment())));
		return this;
	}
	
	public default Amounts computeAvailableMinusMovementIncludedPlusAdjustment() {
		setAvailableMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(NumberHelper.subtract(getAvailable(),getMovementIncluded()),getAdjustment())));
		return this;
	}
	
	public default Amounts computeExpectedAdjustmentMinusAdjustment() {
		setExpectedAdjustmentMinusAdjustment(NumberHelper.getLong(NumberHelper.subtract(getExpectedAdjustment(),getAdjustment())));
		return this;
	}
	
	public default Integer copy(Object[] array,Integer index,Boolean isContainsAvailable,Boolean isContainsExpectedAdjustment) {
		setInitial(NumberHelper.getLong(array[index++],0l));
		setActual(NumberHelper.getLong(array[index++],0l));
		computeMovement();
		setAdjustment(NumberHelper.getLong(array[index++],0l));
		computeActualPlusAdjustment();
		if(Boolean.TRUE.equals(isContainsAvailable)) {
			setAvailable(NumberHelper.getLong(array[index++],0l));
		}
		if(Boolean.TRUE.equals(isContainsExpectedAdjustment)) {
			setExpectedAdjustment(NumberHelper.getLong(array[index++],0l));
			computeExpectedAdjustmentMinusAdjustment();
		}
		return index;
	}
}