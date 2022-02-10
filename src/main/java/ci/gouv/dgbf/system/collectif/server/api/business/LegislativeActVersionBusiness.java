package ci.gouv.dgbf.system.collectif.server.api.business;

import java.io.Serializable;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.collectif.server.api.persistence.LegislativeActVersion;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public interface LegislativeActVersionBusiness extends SpecificBusiness<LegislativeActVersion> {

	String CREATE_AUDIT_IDENTIFIER = "CREATION_VERSION_COLLECTIF_BUDGETAIRE";
	Result create(String code,String name,Byte number,String legislativeActIdentifier,String auditWho);
	
	String COPY_AUDIT_IDENTIFIER = "COPIE_VERSION_COLLECTIF_BUDGETAIRE";
	Result copy(String sourceIdentifier,String destinationIdentifier,CopyOptions options,String auditWho);
	
	String DUPLICATE_AUDIT_IDENTIFIER = "DUPLICATION_VERSION_COLLECTIF_BUDGETAIRE";
	Result duplicate(String identifier,String auditWho);
	
	/**/
	
	@Getter @Setter @Accessors(chain=true)
	public static class CopyOptions implements Serializable {
		
	}
}