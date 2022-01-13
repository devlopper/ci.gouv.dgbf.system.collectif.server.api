package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Collection;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.RegulatoryAct;

public interface RegulatoryActBusiness extends SpecificBusiness<RegulatoryAct> {

	String INCLUDE_AUDIT_IDENTIFIER = "INCLUSION";
	Result include(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable,String userIdentifier);
	Result include(String legislativeActIdentifier,Boolean existingIgnorable,String userIdentifier,String...identifiers);
	
	String EXCLUDE_AUDIT_IDENTIFIER = "EXCLUSION";
	Result exclude(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable,String userIdentifier);
	Result exclude(String legislativeActIdentifier,Boolean existingIgnorable,String userIdentifier,String...identifiers);
}