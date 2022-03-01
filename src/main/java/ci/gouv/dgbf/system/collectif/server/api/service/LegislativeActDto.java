package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface LegislativeActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_NUMBER = "numero";
	String JSON_LEGISLATIVE_ACT_IDENTIFIER = "col_id";
	String JSON_DEFAULT_VERSION_IDENTIFIER = "version_par_defaut_identifiant";
	String JSON_DEFAULT_VERSION_AS_STRING = "version_par_defaut_chaine";
	String JSON_IN_PROGRESS = "en_cours";
	String JSON_IN_PROGRESS_AS_STRING = "en_cours_chaine";
	String JSON_ENTRY_AUTHORIZATION = CommonDto.JSON_ENTRY_AUTHORIZATION;
	String JSON_PAYMENT_CREDIT = CommonDto.JSON_PAYMENT_CREDIT;
	String JSONS_AMOUTNS = CommonDto.JSONS_AMOUTNS;
	String JSONS_STRINGS = CommonDto.JSONS_STRINGS;
	
	String JSON_BUDGETARY_ACT_VERSIONS = "versions_actes_budgetaires";
	String JSON_EXERCISE = "exercice";
	String JSON_EXERCISE_IDENTIFIER = "exercice_identifiant";
	String JSON_EXERCISE_YEAR = "exercice_annee";
	String JSON_EXERCISE_AS_STRING = "exercice_chaine";
	String JSON_DATE_AS_TIMESTAMP = "date_horodatage";
	String JSON_DATE_AS_STRING = "date_chaine";
	String JSON_FROM_DATE_AS_STRING = "date_debut_chaine";
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
}