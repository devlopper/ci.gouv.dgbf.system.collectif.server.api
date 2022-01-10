package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface LegislativeAct extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getSignatory();
	LegislativeAct setSignatory(String signatory);
	
	String getReference();
	LegislativeAct setReference(String reference);
	
	LocalDateTime getCreationDate();
	LegislativeAct setCreationDate(LocalDateTime creationDate);
	
	String NAME = "Collectif budgétaire";
}