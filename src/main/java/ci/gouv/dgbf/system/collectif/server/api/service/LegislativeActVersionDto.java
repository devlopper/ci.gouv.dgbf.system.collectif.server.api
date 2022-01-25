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
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
}