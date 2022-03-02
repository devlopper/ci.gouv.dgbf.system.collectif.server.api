package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import javax.transaction.Transactional;

import org.cyk.utility.business.Result;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Resource;

public interface ResourceBusiness extends ExpenditureResourceBusiness<Resource> {
	
	String ADJUST_AUDIT_IDENTIFIER = "AJUSTEMENT_RESSOURCES";
	/**
	 * Ajuster les revenues.
	 * @param adjustments : revenues
	 * @return
	 */
	@Transactional
	Result adjust(Map<String,Long> adjustments,String auditWho);	
	
	String IMPORT_AUDIT_IDENTIFIER = "IMPORTATION_RESSOURCES";
	
	String COPY_ADJUSTMENTS_AUDIT_IDENTIFIER = "COPIE_AJUSTEMENTS_RESSOURCES";
}