package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Activity extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	ExpenditureNature getExpenditureNature();
	Activity setExpenditureNature(ExpenditureNature expenditureNature);
	
	Section getSection();
	Activity setSection(Section section);
	
	AdministrativeUnit getAdministrativeUnit();
	Activity setAdministrativeUnit(AdministrativeUnit administrativeUnit);
	
	BudgetSpecializationUnit getBudgetSpecializationUnit();
	Activity setBudgetSpecializationUnit(BudgetSpecializationUnit budgetSpecializationUnit);
	
	Action getAction();
	Activity setAction(Action action);
}