package ci.gouv.dgbf.system.collectif.server.api.service;

public interface BudgetaryActVersionDto {

	String getIdentifier();
	BudgetaryActVersionDto setIdentifier(String identifier);
	
	String getCode();
	BudgetaryActVersionDto setCode(String code);
	
	String getName();
	BudgetaryActVersionDto setName(String name);
	
	BudgetaryActDto getBudgetaryAct();
	BudgetaryActVersionDto setBudgetaryAct(BudgetaryActDto budgetaryAct);
		
	String getBudgetaryActIdentifier();
	BudgetaryActVersionDto setBudgetaryActIdentifier(String budgetaryActIdentifier);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_BUDGETARY_ACT = "acte_budgetaire";
	String JSON_BUDGETARY_ACT_IDENTIFIER = "identifiant_acte_budgetaire";
}