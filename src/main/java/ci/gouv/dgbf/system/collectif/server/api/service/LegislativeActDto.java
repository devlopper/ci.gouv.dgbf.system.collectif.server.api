package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface LegislativeActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_LEGISLATIVE_ACT_IDENTIFIER = "col_id";
	String JSON_DEFAULT_VERSION_IDENTIFIER = "version_par_defaut_identifiant";
	String JSON_BUDGETARY_ACT_VERSIONS = "versions_actes_budgetaires";
	String JSON_EXERCISE = "exercice";
	String JSON_EXERCISE_YEAR = "exercice_identifiant";
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
}