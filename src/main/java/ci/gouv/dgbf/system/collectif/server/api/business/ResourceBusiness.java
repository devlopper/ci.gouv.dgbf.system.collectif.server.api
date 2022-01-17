package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import javax.transaction.Transactional;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Resource;

public interface ResourceBusiness extends SpecificBusiness<Resource> {
	
	String ADJUST_AUDIT_IDENTIFIER = "AJUSTEMENT";
	/**
	 * Ajuster les revenues.
	 * @param adjustments : revenues
	 * @return
	 */
	@Transactional
	Result adjust(Map<String,Long> adjustments,String auditWho);	
}