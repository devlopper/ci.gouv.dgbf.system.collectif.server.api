package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ResourceActivity extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	Section getSection();
	Activity setSection(Section section);
	
	BudgetSpecializationUnit getBudgetSpecializationUnit();
	Activity setBudgetSpecializationUnit(BudgetSpecializationUnit budgetSpecializationUnit);
}