package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Expenditure;

public interface ExpenditureBusiness extends SpecificBusiness<Expenditure> {
	
	String ADJUST_AUDIT_IDENTIFIER = "AJUSTEMENT";
	/**
	 * Ajuster les autorisations d'engagements et les crédits de paiements des dépenses.
	 * @param adjustments : autorisations d'engagements et crédits de paiements
	 * @return
	 */
	Result adjust(Map<String,Long[]> adjustments,String auditWho);
	
	String ADJUST_BY_ENTRY_AUTHORIZATIONS_AUDIT_IDENTIFIER = "AJUSTEMENT_PAR_AE";
	/**
	 * {@link #adjust(Map)}.<br/>
	 * Les crédits de paiements sont initialisés avec les autorisations d'engagements.
	 * @param entryAuthorizations : Autorisations d'engagements
	 * @return
	 */
	Result adjustByEntryAuthorizations(Map<String,Long> entryAuthorizations,String auditWho);

	String IMPORT_AUDIT_IDENTIFIER = "IMPORTATION_DEPENSES";
	Result import_(String legislativeActVersionIdentifier,Boolean throwIfRunning,String auditWho);
	Result import_(String legislativeActVersionIdentifier,String auditWho);
	
	String COPY_ADJUSTMENTS_AUDIT_IDENTIFIER = "COPIE_AJUSTEMENTS_DEPENSES";
	Result copyAdjustments(String legislativeActVersionIdentifier,String legislativeActVersionSourceIdentifier,String auditWho);
}