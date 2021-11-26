package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetaryActVersion extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	BudgetaryAct getBudgetaryAct();
	BudgetaryActVersion setBudgetaryAct(BudgetaryAct budgetaryAct);
	
	String getBudgetaryActIdentifier();
	BudgetaryActVersion setBudgetaryActIdentifier(String budgetaryActIdentifier);
	
	Byte getNumber();
	BudgetaryActVersion setNumber(Byte number);
	
	LocalDateTime getCreationDate();
	BudgetaryActVersion setCreationDate(LocalDateTime creationDate);
}