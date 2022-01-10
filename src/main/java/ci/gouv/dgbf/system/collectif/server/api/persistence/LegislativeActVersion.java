package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface LegislativeActVersion extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	LegislativeAct getAct();
	LegislativeActVersion setAct(LegislativeAct act);
	
	String getActIdentifier();
	LegislativeActVersion setActIdentifier(String actIdentifier);
	
	Byte getNumber();
	LegislativeActVersion setNumber(Byte number);
	
	LocalDateTime getCreationDate();
	LegislativeActVersion setCreationDate(LocalDateTime creationDate);
	
	String NAME = "Version collectif budgétaire";
}