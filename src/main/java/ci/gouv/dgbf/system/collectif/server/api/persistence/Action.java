package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Action extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	Section getSection();
	Action setSection(Section section);
	
	BudgetSpecializationUnit getBudgetSpecializationUnit();
	Action setBudgetSpecializationUnit(BudgetSpecializationUnit budgetSpecializationUnit);
}