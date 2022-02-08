package ci.gouv.dgbf.system.collectif.server.api.persistence;

import javax.persistence.EntityManager;

import org.cyk.utility.persistence.SpecificPersistence;

public interface LegislativeActVersionPersistence extends SpecificPersistence<LegislativeActVersion> {

	LegislativeActVersion readUsingNamedQueryReadByIdentifier(String identifier,EntityManager entityManager);
}