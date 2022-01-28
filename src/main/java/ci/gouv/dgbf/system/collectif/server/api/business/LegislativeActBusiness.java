package ci.gouv.dgbf.system.collectif.server.api.business;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.LegislativeAct;

public interface LegislativeActBusiness extends SpecificBusiness<LegislativeAct> {

	String UPDATE_DEFAULT_VERSION_AUDIT_IDENTIFIER = "MISE_A_JOUR_VERSION_PAR_DEFAULT";
	Result updateDefaultVersion(String legislativeActIdentifier,String legislativeActVersionIdentifier,String auditWho);
}