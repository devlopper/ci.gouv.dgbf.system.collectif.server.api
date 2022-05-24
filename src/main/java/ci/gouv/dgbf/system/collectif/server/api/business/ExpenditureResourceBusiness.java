package ci.gouv.dgbf.system.collectif.server.api.business;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;
import org.cyk.utility.persistence.query.Filter;

public interface ExpenditureResourceBusiness<T> extends SpecificBusiness<T> {

	Result import_(String legislativeActVersionIdentifier,Boolean throwIfRunning,String auditWho);
	Result import_(String legislativeActVersionIdentifier,String auditWho);
	
	Result copy(String legislativeActVersionIdentifier,String legislativeActVersionSourceIdentifier,String auditWho);
	
	//Result getBytes(Filter filter);
}