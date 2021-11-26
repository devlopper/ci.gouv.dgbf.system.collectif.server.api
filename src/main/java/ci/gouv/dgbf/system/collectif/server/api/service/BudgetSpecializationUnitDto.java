package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetSpecializationUnitDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getSectionIdentifier();
	BudgetSpecializationUnitDto setSectionIdentifier(String identifier);
	
	String getSectionCode();
	BudgetSpecializationUnitDto setSectionCode(String code);
	
	String getSectionCodeName();
	BudgetSpecializationUnitDto setSectionCodeName(String codeName);
	
	SectionDto getSection();
	BudgetSpecializationUnitDto setSection(SectionDto section);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_SECTION = "section";
	String JSON_SECTION_IDENTIFIER = "section_identifiant";
	String JSON_SECTION_CODE = "section_code";
	String JSON_SECTION_CODE_NAME = "section_libelle";
}