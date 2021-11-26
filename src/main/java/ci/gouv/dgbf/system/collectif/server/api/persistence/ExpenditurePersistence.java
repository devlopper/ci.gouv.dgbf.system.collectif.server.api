package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.util.Map;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	Integer updateEntryAuthoriations(Map<String,Long> entryAuthorizations);

}