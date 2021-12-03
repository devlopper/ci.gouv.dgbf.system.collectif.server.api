package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ActionDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	SectionDto getSection();
	ActionDto setSection(SectionDto section);
	
	BudgetSpecializationUnitDto getBudgetSpecializationUnit();
	ActionDto setBudgetSpecializationUnit(BudgetSpecializationUnitDto budgetSpecializationUnit);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_SECTION = "section";
	String JSON_BUDGET_SPECIALIZATION_UNIT = "unite_specialisation_budget";
	
	String JSONS_SECTION_BUDGET_SPECIALIZATION_UNIT = "section_usb";
}