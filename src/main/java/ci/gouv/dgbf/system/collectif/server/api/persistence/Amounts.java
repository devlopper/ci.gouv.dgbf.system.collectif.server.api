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
	
	Long getActualAtLegislativeActDate();
	Amounts setActualAtLegislativeActDate(Long actualAtLegislativeActDate);
	
	Long getActualMinusMovementIncluded();
	Amounts setActualMinusMovementIncluded(Long actualMinusMovementIncluded);
	
	Long getActualPlusAdjustment();
	Amounts setActualPlusAdjustment(Long actualPlusAdjustment);
	
	Long getAvailable();
	Amounts setAvailable(Long available);
	
	Long getAdjustment();
	Amounts setAdjustment(Long adjustment);
	
	Long getAdjustmentLessThanZero();
	Amounts setAdjustmentLessThanZero(Long adjustmentLessThanZero);
	
	Long getAdjustmentGreaterThanZero();
	Amounts setAdjustmentGreaterThanZero(Long adjustmentGreaterThanZero);
	
	Long getExpectedAdjustment();
	Amounts setExpectedAdjustment(Long expectedAdjustment);
	
	Long getExpectedAdjustmentMinusAdjustment();
	Amounts setExpectedAdjustmentMinusAdjustment(Long expectedAdjustmentMinusAdjustment);
	
	Long getActualMinusMovementIncludedPlusAdjustment();
	Amounts setActualMinusMovementIncludedPlusAdjustment(Long actualMinusMovementIncludedPlusAdjustment);
	
	Long getAvailableMinusMovementIncludedPlusAdjustment();
	Amounts setAvailableMinusMovementIncludedPlusAdjustment(Long availableMinusMovementIncludedPlusAdjustment);
	
	Long getActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment();
	Amounts setActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment(Long actualAtLegislativeActDateMinusMovementIncludedPlusAdjustment);
	
	Long getActualAtLegislativeActDatePlusAdjustment();
	Amounts setActualAtLegislativeActDatePlusAdjustment(Long actualAtLegislativeActDatePlusAdjustment);
	
	Long getMovementIncludedPlusAdjustment();
	Amounts setMovementIncludedPlusAdjustment(Long movementIncludedPlusAdjustment);
	
	Long getInitialPlusMovementIncludedPlusAdjustment();
	Amounts setInitialPlusMovementIncludedPlusAdjustment(Long initialPlusMovementIncludedPlusAdjustment);
	
	Long getInitialPlusMovementIncluded();
	Amounts setInitialPlusMovementIncluded(Long initialPlusMovementIncluded);
	
	public default Amounts zerofy() {
		setInitial(0l);
		setMovement(0l);
		setActual(0l);
		
		setAdjustment(0l);
		setExpectedAdjustment(0l);
		
		setAvailable(0l);
		setMovementIncluded(0l);
		setActualAtLegislativeActDate(0l);
		
		setActualPlusAdjustment(0l);
		setActualMinusMovementIncluded(0l);
		setActualMinusMovementIncludedPlusAdjustment(0l);
		setExpectedAdjustmentMinusAdjustment(0l);
		setAvailableMinusMovementIncludedPlusAdjustment(0l);
		setActualAtLegislativeActDatePlusAdjustment(0l);
		setActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment(0l);
		setMovementIncludedPlusAdjustment(0l);
		setInitialPlusMovementIncludedPlusAdjustment(0l);
		setInitialPlusMovementIncluded(0l);
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
	
	String COMPUTE_MOVEMENT = "computeMovement";
	public default Amounts computeMovement() {
		setMovement(NumberHelper.getLong(NumberHelper.subtract(getActual(),getInitial())));
		return this;
	}
	
	String COMPUTE_ACTUAL_PLUS_ADJUSTMENT = "computeActualPlusAdjustment";
	public default Amounts computeActualPlusAdjustment() {
		setActualPlusAdjustment(NumberHelper.getLong(NumberHelper.add(getActual(),getAdjustment())));
		return this;
	}
	
	String COMPUTE_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "computeMovementIncludedPlusAdjustment";
	public default Amounts computeMovementIncludedPlusAdjustment() {
		setMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(getMovementIncluded(),getAdjustment())));
		return this;
	}
	
	String COMPUTE_INITIAL_PLUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "computeInitialPlusMovementIncludedPlusAdjustment";
	public default Amounts computeInitialPlusMovementIncludedPlusAdjustment() {
		setInitialPlusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(getInitial(),getMovementIncluded(),getAdjustment())));
		return this;
	}
	
	String COMPUTE_INITIAL_PLUS_MOVEMENT_INCLUDED = "computeInitialPlusMovementIncluded";
	public default Amounts computeInitialPlusMovementIncluded() {
		setInitialPlusMovementIncluded(NumberHelper.getLong(NumberHelper.add(getInitial(),getMovementIncluded())));
		return this;
	}
	
	String COMPUTE_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "computeActualMinusMovementIncludedPlusAdjustment";
	public default Amounts computeActualMinusMovementIncludedPlusAdjustment() {
		setActualMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(NumberHelper.subtract(getActual(),getMovementIncluded()),getAdjustment())));
		return this;
	}
	
	String COMPUTE_AVAILABLE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "computeAvailableMinusMovementIncludedPlusAdjustment";
	public default Amounts computeAvailableMinusMovementIncludedPlusAdjustment() {
		setAvailableMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(NumberHelper.subtract(getAvailable(),getMovementIncluded()),getAdjustment())));
		return this;
	}
	
	String COMPUTE_EXPECTED_ADJUSTMENT_MINUS_ADJUSTMENT = "computeExpectedAdjustmentMinusAdjustment";
	public default Amounts computeExpectedAdjustmentMinusAdjustment() {
		setExpectedAdjustmentMinusAdjustment(NumberHelper.getLong(NumberHelper.subtract(getExpectedAdjustment(),getAdjustment())));
		return this;
	}
	
	String COMPUTE_ACTUAL_AT_LEGISLATIVE_ACT_DATE_PLUS_ADJUSTMENT = "computeActualAtLegislativeActDatePlusAdjustment";
	public default Amounts computeActualAtLegislativeActDatePlusAdjustment() {
		setActualAtLegislativeActDatePlusAdjustment(NumberHelper.getLong(NumberHelper.add(getActualAtLegislativeActDate(),getAdjustment())));
		return this;
	}
	
	String COMPUTE_ACTUAL_AT_LEGISLATIVE_ACT_DATE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "computeActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment";
	public default Amounts computeActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment() {
		setActualAtLegislativeActDateMinusMovementIncludedPlusAdjustment(NumberHelper.getLong(NumberHelper.add(NumberHelper.subtract(getActualAtLegislativeActDate(),getMovementIncluded()),getAdjustment())));
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