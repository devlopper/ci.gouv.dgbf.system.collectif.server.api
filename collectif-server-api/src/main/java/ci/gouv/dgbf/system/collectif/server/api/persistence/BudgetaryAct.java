package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

public interface BudgetaryAct {

	String getIdentifier();
	BudgetaryAct setIdentifier(String identifier);
	
	String getSignatory();
	BudgetaryAct setSignatory(String signatory);
	
	String getReference();
	BudgetaryAct setReference(String reference);
	
	LocalDateTime getCreationDate();
	BudgetaryAct setCreationDate(LocalDateTime creationDate);
	
}