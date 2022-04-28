package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ConfigurationPropertyPersistence extends SpecificPersistence<ConfigurationProperty> {

	String readValueByCode(String code);
	
}