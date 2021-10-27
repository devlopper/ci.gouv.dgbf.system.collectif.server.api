package ci.gouv.dgbf.system.collectif.server.api.persistence;

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
	
	Long getAvailable();
	Amounts setAvailable(Long available);
	
	Long getAdjustment();
	Amounts setAdjustment(Long adjustment);
	
	Long getActualMinusMovementIncludedPlusAdjustment();
	Amounts setActualMinusMovementIncludedPlusAdjustment(Long actualMinusMovementIncludedPlusAdjustment);	
}