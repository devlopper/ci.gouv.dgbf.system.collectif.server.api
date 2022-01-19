package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetSpecializationUnit extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getSectionIdentifier();
	BudgetSpecializationUnit setSectionIdentifier(String identifier);
	
	String getSectionCode();
	BudgetSpecializationUnit setSectionCode(String code);
	
	String getSectionCodeName();
	BudgetSpecializationUnit setSectionCodeName(String codeName);
	
	Section getSection();
	BudgetSpecializationUnit setSection(Section section);

	String NAME = "Unité de spécialisation du budget";
	
	String INITALS = "U.S.B.";
}