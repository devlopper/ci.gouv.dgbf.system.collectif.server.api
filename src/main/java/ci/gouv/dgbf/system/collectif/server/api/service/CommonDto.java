package ci.gouv.dgbf.system.collectif.server.api.service;

public interface CommonDto {
	
	String JSON_ENTRY_AUTHORIZATION = "autorisation_engagement";
	String JSON_ENTRY_AUTHORIZATION_ADJUSTMENT = "autorisation_engagement_ajustement";
	String JSON_PAYMENT_CREDIT = "credit_paiement";
	String JSON_PAYMENT_CREDIT_ADJUSTMENT = "credit_paiement_ajustement";
	String JSON_REVENUE = "revenu";
	
	String JSONS_AMOUTNS = "montants";
	String JSONS_EXPENDITURES_AMOUTNS = "montants_depenses";
	String JSONS_EXPENDITURES_AMOUTNS_WITHOUT_AVAILABLE = "montants_depenses_sans_disponible";
	String JSONS_EXPENDITURES_AMOUTNS_WITHOUT_INCLUDED_MOVEMENT_AND_AVAILABLE = "montants_depenses_sans_mouvement_inclus_et_disponible";
	String JSONS_EXPENDITURES_AMOUTNS_WITH_AVAILABLE_ONLY = "montants_depenses_avec_disponible_seulement";
	String JSONS_EXPENDITURES_AMOUTNS_WITH_INCLUDED_MOVEMENT_ONLY = "montants_depenses_avec_mouvement_inclus_seulement";
	String JSONS_EXPENDITURES_ENTRY_AUTHORIZATION_AMOUTNS = "montants_"+JSON_ENTRY_AUTHORIZATION;
	String JSONS_EXPENDITURES_PAYMENT_CREDIT_AMOUTNS = "montants_"+JSON_PAYMENT_CREDIT;
	String JSONS_RESOURCES_AMOUTNS = "montants_ressources";
	String JSONS_STRINGS = "chaines";
	
	/* Audits */
	String JSON___AUDIT__ = "__audit__";
	String JSONS___AUDITS__ = "audits";
	String JSON___AUDIT_WHO__ = "audit_acteur";
	String JSON___AUDIT_FUNCTIONALITY__ = "audit_fonctionnalite";
	String JSON___AUDIT_WHAT__ = "audit_action";
	String JSON___AUDIT_WHEN__ = "audit_date";
}