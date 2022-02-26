package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Collection;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.RegulatoryAct;

public interface RegulatoryActBusiness extends SpecificBusiness<RegulatoryAct> {

	String INCLUDE_BY_LEGISLATIVE_ACT_IDENTIFIER_AUDIT_IDENTIFIER = "INCLUSION_PAR_VERSION_COLLECTIF";
	Result includeByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
	
	String INCLUDE_AUDIT_IDENTIFIER = "INCLUSION";
	Result include(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable,String auditWho);
	Result include(String legislativeActIdentifier,Boolean existingIgnorable,String auditWho,String...identifiers);
	
	String EXCLUDE_AUDIT_IDENTIFIER = "EXCLUSION";
	Result exclude(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable,String auditWho);
	Result exclude(String legislativeActIdentifier,Boolean existingIgnorable,String auditWho,String...identifiers);
}