package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Expenditure;

public interface ExpenditureBusiness extends SpecificBusiness<Expenditure> {
	
	/**
	 * Ajuster les autorisations d'engagements et les crédits de paiements des dépenses.
	 * @param adjustments : autorisations d'engagements et crédits de paiements
	 * @return
	 */
	Result adjust(Map<String,Long[]> adjustments);
	
	/**
	 * Ajuster les autorisations d'engagements des dépenses.<br/>
	 * Les crédits de paiements sont initialisés avec les autorisations d'engagements.
	 * @param entryAuthorizations : Autorisations d'engagements
	 * @return
	 */
	Result adjustByEntryAuthorizations(Map<String,Long> entryAuthorizations);
	
}