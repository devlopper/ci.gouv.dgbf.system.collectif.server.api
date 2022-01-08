package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface RegulatoryActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_YEAR = "exercice";
	String JSON_ENTRY_AUTHORIZATION_AMOUNT = "autorisation_engagement";
	String JSON_PAYMENT_CREDIT_AMOUNT = "credit_paiement";
}