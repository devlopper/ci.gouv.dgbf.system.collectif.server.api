package ci.gouv.dgbf.system.collectif.server.api.business;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.LegislativeActVersion;

public interface LegislativeActVersionBusiness extends SpecificBusiness<LegislativeActVersion> {

	String CREATE_AUDIT_IDENTIFIER = "CREATION";
	Result create(String code,String name,Byte number,String legislativeActIdentifier,String auditWho);
}