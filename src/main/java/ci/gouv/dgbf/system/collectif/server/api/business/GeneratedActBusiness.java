package ci.gouv.dgbf.system.collectif.server.api.business;

import javax.transaction.Transactional;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.GeneratedAct;

public interface GeneratedActBusiness extends SpecificBusiness<GeneratedAct> {

	@Transactional
	Result generateByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
	
}