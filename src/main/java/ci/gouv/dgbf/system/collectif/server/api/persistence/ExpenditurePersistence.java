package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	void import_(String legislativeActVersionIdentifier,String auditWho,String auditFunctionality,String auditWhat,java.sql.Date auditWhen);
	
}