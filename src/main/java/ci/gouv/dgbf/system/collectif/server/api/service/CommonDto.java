package ci.gouv.dgbf.system.collectif.server.api.service;

public interface CommonDto {
	
	String JSONS_AMOUTNS = "montants";
	String JSONS_STRINGS = "chaines";
	
	String JSON_ENTRY_AUTHORIZATION = "autorisation_engagement";
	String JSON_PAYMENT_CREDIT = "credit_paiement";
	
	/* Audits */
	String JSON___AUDIT__ = "__audit__";
	String JSONS___AUDITS__ = "audits";
	String JSON___AUDIT_WHO__ = "audit_acteur";
	String JSON___AUDIT_FUNCTIONALITY__ = "audit_fonctionnalite";
	String JSON___AUDIT_WHAT__ = "audit_action";
	String JSON___AUDIT_WHEN__ = "audit_date";
}