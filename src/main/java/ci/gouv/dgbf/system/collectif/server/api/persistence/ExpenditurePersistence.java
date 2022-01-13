package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;
import java.util.Map;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	Integer updateAdjustments(Map<String,Long[]> adjustments,String auditFunctionality,String auditWho,String auditWhat,LocalDateTime auditWhen);
}