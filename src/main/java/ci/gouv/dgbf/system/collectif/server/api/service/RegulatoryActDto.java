package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface RegulatoryActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_YEAR = "exercice";
	String JSON_DATE_AS_STRING = "date_chaine";
	String JSON_ENTRY_AUTHORIZATION_AMOUNT = "autorisation_engagement";
	String JSON_PAYMENT_CREDIT_AMOUNT = "credit_paiement";
	String JSON_INCLUDED = "inclus";
	String JSON_INCLUDED_AS_STRING = "inclus_chaine";
	
	String JSONS_YEAR_NAME_ENTRY_AUTHORIZATION_AMOUNT_PAYMENT_CREDIT_AMOUNT_INCLUDED_AS_STRING = "exercice_libelle_autorisation_engagement_credit_paiement_inclus_chaine";
	String JSONS_CODE_NAME_YEAR_DATE_AS_STRING_ENTRY_AUTHORIZATION_AMOUNT_PAYMENT_CREDIT_AMOUNT_INCLUDED_AND_INCLUDED_AS_STRING = "code_libelle_exercice_date_chaine_autorisation_engagement_credit_paiement_inclus_chaine";
	
	String JSONS_IDENTIFIERS = "identifiants";
	String JSON_LEGISLATIVE_VERSION_IDENTIFIER = "identifiant_version_collectif";
	String JSON_EXISTING_IGNORABLE = "existant_ignorable";
	
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSONS___AUDITS__ = CommonDto.JSONS___AUDITS__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
	String JSON___AUDIT_FUNCTIONALITY__ = CommonDto.JSON___AUDIT_FUNCTIONALITY__;
	String JSON___AUDIT_WHAT__ = CommonDto.JSON___AUDIT_WHAT__;
	String JSON___AUDIT_WHEN__ = CommonDto.JSON___AUDIT_WHEN__;
}