package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.util.Map;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	Integer updateAdjustments(Map<String,Long[]> adjustments);
}