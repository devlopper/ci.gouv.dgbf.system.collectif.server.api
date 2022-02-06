package ci.gouv.dgbf.system.collectif.server.api.business;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.LegislativeAct;

public interface LegislativeActBusiness extends SpecificBusiness<LegislativeAct> {

	String CREATE_AUDIT_IDENTIFIER = "CREATION";
	Result create(String code,String name,String exerciseIdentifier,String auditWho);
	
	String UPDATE_DEFAULT_VERSION_AUDIT_IDENTIFIER = "MISE_A_JOUR_VERSION_PAR_DEFAUT";
	Result updateDefaultVersion(String legislativeActVersionIdentifier,String auditWho);
	
	String UPDATE_IN_PROGRESS_AUDIT_IDENTIFIER = "MISE_A_JOUR_EN_COURS";
	Result updateInProgress(String legislativeActIdentifier,Boolean inProgress,String auditWho);
}