package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Expenditure;

public interface ExpenditureBusiness extends SpecificBusiness<Expenditure> {
	
	/**
	 * Ajuster les autorisations d'engagments
	 * @param entryAuthorizations : Autorisations d'engagements
	 * @return
	 */
	Result adjust(Map<String,Long> entryAuthorizations);
	
}