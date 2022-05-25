package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Map;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

public interface ExpenditureResourceBusiness<T> extends SpecificBusiness<T> {

	Result import_(String legislativeActVersionIdentifier,Boolean throwIfRunning,String auditWho);
	Result import_(String legislativeActVersionIdentifier,String auditWho);
	
	Result copy(String legislativeActVersionIdentifier,String legislativeActVersionSourceIdentifier,String auditWho);
	
	Result buildAdjustmentIsNotZeroReportResponse(Map<String,String> parameters,String fileType,Boolean isContentInline,String auditWho);
	Result buildAdjustmentIsNotZeroReportStream(Map<String,String> parameters,String fileType,String auditWho);
	
}