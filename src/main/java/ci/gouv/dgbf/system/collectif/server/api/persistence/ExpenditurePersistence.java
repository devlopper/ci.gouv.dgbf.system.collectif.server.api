package ci.gouv.dgbf.system.collectif.server.api.persistence;

import javax.persistence.EntityManager;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	void import_(String legislativeActVersionIdentifier,String auditWho,String auditFunctionality,String auditWhat,java.sql.Date auditWhen,EntityManager entityManager);
	void import_(String legislativeActVersionIdentifier,String auditWho,String auditFunctionality,String auditWhat,java.sql.Date auditWhen);
	
}