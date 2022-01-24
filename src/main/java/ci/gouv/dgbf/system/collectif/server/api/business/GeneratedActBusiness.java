package ci.gouv.dgbf.system.collectif.server.api.business;

import javax.transaction.Transactional;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.GeneratedAct;

public interface GeneratedActBusiness extends SpecificBusiness<GeneratedAct> {

	String GENERATE_BY_LEGISLATIVE_ACT_VERSION_IDENTIFIER_AUDIT_IDENTIFIER = "GENERATION_PAR_VERSION_COLLECTIF";
	/**
	 * 
	 * @param legislativeActVersionIdentifier
	 * @param auditWho
	 * @return
	 */
	@Transactional
	Result generateByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
	
	String DELETE_BY_LEGISLATIVE_ACT_VERSION_IDENTIFIER_AUDIT_IDENTIFIER = "SUPPRESSION_PAR_VERSION_COLLECTIF";
	Result deleteByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
}