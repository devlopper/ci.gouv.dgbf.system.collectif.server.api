package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetaryActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	//List<BudgetaryActVersionDto> getBudgetaryActVersions();
	//BudgetaryActDto setBudgetaryActVersions(List<BudgetaryActVersionDto> budgetaryActVersions);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_BUDGETARY_ACT_VERSIONS = "versions_actes_budgetaires";
}