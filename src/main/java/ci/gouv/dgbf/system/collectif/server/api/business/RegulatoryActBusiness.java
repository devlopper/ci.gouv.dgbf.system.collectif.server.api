package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Collection;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.RegulatoryAct;

public interface RegulatoryActBusiness extends SpecificBusiness<RegulatoryAct> {

	Result include(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable);
	Result include(String legislativeActIdentifier,Boolean existingIgnorable,String...identifiers);
	
	Result exclude(Collection<String> identifiers,String legislativeActVersionIdentifier,Boolean existingIgnorable);
	Result exclude(String legislativeActIdentifier,Boolean existingIgnorable,String...identifiers);
}