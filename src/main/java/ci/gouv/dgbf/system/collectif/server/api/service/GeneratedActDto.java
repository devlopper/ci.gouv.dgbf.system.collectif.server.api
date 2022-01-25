package ci.gouv.dgbf.system.collectif.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface GeneratedActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_APPLIED = "applique";
	String JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER = "vc_id";
	
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSONS___AUDITS__ = CommonDto.JSONS___AUDITS__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
	String JSON___AUDIT_FUNCTIONALITY__ = CommonDto.JSON___AUDIT_FUNCTIONALITY__;
	String JSON___AUDIT_WHAT__ = CommonDto.JSON___AUDIT_WHAT__;
	String JSON___AUDIT_WHEN__ = CommonDto.JSON___AUDIT_WHEN__;
}