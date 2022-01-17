package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ResourceActivityDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	SectionDto getSection();
	ActivityDto setSection(SectionDto section);
	
	BudgetSpecializationUnitDto getBudgetSpecializationUnit();
	ActivityDto setBudgetSpecializationUnit(BudgetSpecializationUnitDto budgetSpecializationUnit);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_SECTION = "section";
	String JSON_BUDGET_SPECIALIZATION_UNIT = "unite_specialisation_budget";
	String JSON_ECONOMIC_NATURES = "natures_economiques";
	
	String JSONS_SECTION_BUDGET_SPECIALIZATION_UNIT = "section_usb";
}