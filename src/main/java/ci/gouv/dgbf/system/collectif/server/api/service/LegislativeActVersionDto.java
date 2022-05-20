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
	String JSON_ADJUSTABLE = "ajustable";
	String JSON_ADJUSTABLE_AS_STRING = "ajustable_chaine";
	String JSON_IS_DEFAULT_VERSION = "est_version_par_defaut";
	String JSON_IS_DEFAULT_VERSION_AS_STRING = "est_version_par_defaut_chaine";
	String JSON_LEGISLATIVE_ACT = "col";
	String JSON_LEGISLATIVE_ACT_IDENTIFIER = "col_id";
	String JSON_LEGISLATIVE_ACT_DATE_AS_TIMESTAMP = "col_date_horodatage";
	String JSON_LEGISLATIVE_ACT_FROM_DATE_AS_TIMESTAMP = "col_date_debut_horodatage";
	String JSONS_LEGISLATIVE_ACT_FROM_DATE_AS_TIMESTAMP_DATE_AS_TIMESTAMP = "col_date_debut_horodatage_date_horodatage";
	String JSON_LEGISLATIVE_ACT_AS_STRING = "col_chaine";
	String JSON_GENERATED_ACT_COUNT = "nombre_acte_genere";
	String JSON_ACT_GENERATABLE = "acte_generable";
	String JSON_ACT_GENERATABLE_AS_STRING = "acte_generable_chaine";
	String JSON_GENERATED_ACT_DELETABLE = "acte_genere_supprimable";
	String JSON_GENERATED_ACT_DELETABLE_AS_STRING = "acte_genere_supprimable_chaine";
	String JSONS_GENERATED_ACT_COUNT_ACT_GENERATABLE_GENERATED_ACT_DELETABLE = "na_agbl_ag_sup";
	String JSON_ENTRY_AUTHORIZATION = CommonDto.JSON_ENTRY_AUTHORIZATION;
	String JSON_PAYMENT_CREDIT = CommonDto.JSON_PAYMENT_CREDIT;
	String JSON_REVENUE = CommonDto.JSON_REVENUE;
	
	String JSONS_AMOUTNS = CommonDto.JSONS_AMOUTNS;
	String JSONS_EXPENDITURES_AMOUTNS = CommonDto.JSONS_EXPENDITURES_AMOUTNS;
	String JSONS_EXPENDITURES_AMOUTNS_WITHOUT_AVAILABLE = CommonDto.JSONS_EXPENDITURES_AMOUTNS_WITHOUT_AVAILABLE;
	String JSONS_EXPENDITURES_AMOUTNS_WITHOUT_INCLUDED_MOVEMENT_AND_AVAILABLE = CommonDto.JSONS_EXPENDITURES_AMOUTNS_WITHOUT_INCLUDED_MOVEMENT_AND_AVAILABLE;
	String JSONS_EXPENDITURES_AMOUTNS_WITH_AVAILABLE_ONLY = CommonDto.JSONS_EXPENDITURES_AMOUTNS_WITH_AVAILABLE_ONLY;
	String JSONS_EXPENDITURES_AMOUTNS_WITH_INCLUDED_MOVEMENT_ONLY = CommonDto.JSONS_EXPENDITURES_AMOUTNS_WITH_INCLUDED_MOVEMENT_ONLY;
	String JSONS_EXPENDITURES_AMOUTNS_WITH_ADJUSTMENT_LESS_THAN_ZERO_GREATER_THAN_ZERO_ONLY = CommonDto.JSONS_EXPENDITURES_AMOUTNS_WITH_ADJUSTMENT_LOWER_THAN_ZERO_GREATER_THAN_ZERO_ONLY;
	
	String JSONS_EXPENDITURES_ENTRY_AUTHORIZATION_AMOUTNS = CommonDto.JSONS_EXPENDITURES_ENTRY_AUTHORIZATION_AMOUTNS;
	String JSONS_EXPENDITURES_PAYMENT_CREDIT_AMOUTNS = CommonDto.JSONS_EXPENDITURES_PAYMENT_CREDIT_AMOUTNS;
	String JSONS_RESOURCES_AMOUTNS = CommonDto.JSONS_RESOURCES_AMOUTNS;
	String JSONS_STRINGS = CommonDto.JSONS_STRINGS;
	
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
}