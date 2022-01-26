package ci.gouv.dgbf.system.collectif.server.api.service;

public interface LegislativeActVersionDto {

	String getIdentifier();
	LegislativeActVersionDto setIdentifier(String identifier);
	
	String getCode();
	LegislativeActVersionDto setCode(String code);
	
	String getName();
	LegislativeActVersionDto setName(String name);
	
	LegislativeActDto getAct();
	LegislativeActVersionDto setAct(LegislativeActDto act);

	String getActIdentifier();
	LegislativeActVersionDto setActIdentifier(String actIdentifier);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_BUDGETARY_ACT = "acte_budgetaire";
	String JSON_BUDGETARY_ACT_IDENTIFIER = "identifiant_acte_budgetaire";
	String JSON_GENERATED_ACT_COUNT = "nombre_acte_genere";
	String JSON_ACT_GENERATABLE = "acte_generable";
	String JSON_GENERATED_ACT_DELETABLE = "acte_genere_supprimable";
	String JSONS_GENERATED_ACT_COUNT_ACT_GENERATABLE_GENERATED_ACT_DELETABLE = "nombre_acte_acte_generable_acte_genere_supprimable";
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
}