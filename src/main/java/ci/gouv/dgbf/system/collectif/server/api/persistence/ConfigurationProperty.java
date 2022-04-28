package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ConfigurationProperty extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getValue();
	ConfigurationProperty setValue(String value);
	
	String NAME = "Propriété de configuration";
	String INITIALS = "P.C.";
}