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
	String JSON_NUMBER = "numero";
	String JSON_LEGISLATIVE_ACT = "acte_budgetaire";
	String JSON_LEGISLATIVE_ACT_IDENTIFIER = "identifiant_acte_budgetaire";
	String JSON_LEGISLATIVE_ACT_AS_STRING = "acte_budgetaire_chaine";
	String JSON_GENERATED_ACT_COUNT = "nombre_acte_genere";
	String JSON_ACT_GENERATABLE = "acte_generable";
	String JSON_ACT_GENERATABLE_AS_STRING = "acte_generable_chaine";
	String JSON_GENERATED_ACT_DELETABLE = "acte_genere_supprimable";
	String JSON_GENERATED_ACT_DELETABLE_AS_STRING = "acte_genere_supprimable_chaine";
	String JSONS_GENERATED_ACT_COUNT_ACT_GENERATABLE_GENERATED_ACT_DELETABLE = "nombre_acte_acte_generable_acte_genere_supprimable";
	String JSON_ENTRY_AUTHORIZATION = CommonDto.JSON_ENTRY_AUTHORIZATION;
	String JSON_PAYMENT_CREDIT = CommonDto.JSON_PAYMENT_CREDIT;
	
	String JSONS_AMOUTNS = CommonDto.JSONS_AMOUTNS;
	String JSONS_STRINGS = CommonDto.JSONS_STRINGS;
	
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
}