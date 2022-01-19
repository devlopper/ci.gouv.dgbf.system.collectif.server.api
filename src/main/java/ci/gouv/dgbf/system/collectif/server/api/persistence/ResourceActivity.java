package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ResourceActivity extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	Section getSection();
	ResourceActivity setSection(Section section);
	
	BudgetSpecializationUnit getBudgetSpecializationUnit();
	ResourceActivity setBudgetSpecializationUnit(BudgetSpecializationUnit budgetSpecializationUnit);
	
	String NAME = "Activité";
}