package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ActivityDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	ExpenditureNatureDto getExpenditureNature();
	ActivityDto setExpenditureNature(ExpenditureNatureDto expenditureNature);
	
	SectionDto getSection();
	ActivityDto setSection(SectionDto section);
	
	AdministrativeUnitDto getAdministrativeUnit();
	ActivityDto setAdministrativeUnit(AdministrativeUnitDto administrativeUnit);
	
	BudgetSpecializationUnitDto getBudgetSpecializationUnit();
	ActivityDto setBudgetSpecializationUnit(BudgetSpecializationUnitDto budgetSpecializationUnit);
	
	ActionDto getAction();
	ActivityDto setAction(ActionDto action);
	/*
	ArrayList<? extends EconomicNatureDto> getEconomicNatures();
	ActivityDto setEconomicNatures(ArrayList<? extends EconomicNatureDto> economicNatures);
	
	ArrayList<? extends FundingSourceDto> getFundingSources();
	ActivityDto setFundingSources(ArrayList<? extends FundingSourceDto> fundingSources);
	
	ArrayList<? extends LessorDto> getLessors();
	ActivityDto setLessors(ArrayList<? extends LessorDto> lessors);
	*/
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_EXPENDITURE_NATURE = "nature_depense";
	String JSON_SECTION = "section";
	String JSON_ADMINISTRATIVE_UNIT = "unite_administrative";
	String JSON_BUDGET_SPECIALIZATION_UNIT = "unite_specialisation_budget";
	String JSON_ACTION = "action";
	String JSON_ECONOMIC_NATURES = "natures_economiques";
	String JSON_FUNDING_SOURCES = "source_financements";
	String JSON_LESSORS = "bailleurs";
	
	String JSONS_SECTION_ADMINISTRATIVE_UNIT_EXPENDITURE_NATURE_BUDGET_SPECIALIZATION_UNIT_ACTION = "nd_section_ua_usb_action";
}