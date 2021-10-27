package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

public interface BudgetaryActVersion {

	String getIdentifier();
	BudgetaryActVersion setIdentifier(String identifier);
	
	String getCode();
	BudgetaryActVersion setCode(String code);
	
	String getName();
	BudgetaryActVersion setName(String name);
	
	BudgetaryAct getBudgetaryAct();
	BudgetaryActVersion setBudgetaryAct(BudgetaryAct budgetaryAct);
	
	Byte getNumber();
	BudgetaryActVersion setNumber(Byte number);
	
	LocalDateTime getCreationDate();
	BudgetaryActVersion setCreationDate(LocalDateTime creationDate);
}