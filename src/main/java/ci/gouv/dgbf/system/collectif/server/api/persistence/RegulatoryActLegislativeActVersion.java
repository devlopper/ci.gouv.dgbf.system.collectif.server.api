package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarString;

public interface RegulatoryActLegislativeActVersion extends IdentifiableSystemScalarString {

	RegulatoryActLegislativeActVersion setRegulatoryAct(RegulatoryAct regulatoryAct);
	RegulatoryAct getRegulatoryAct();
	
	RegulatoryActLegislativeActVersion setLegislativeActVersion(LegislativeActVersion legislativeActVersion);
	LegislativeActVersion getLegislativeActVersion();
	
	RegulatoryActLegislativeActVersion setIncluded(Boolean included);
	Boolean getIncluded();
}