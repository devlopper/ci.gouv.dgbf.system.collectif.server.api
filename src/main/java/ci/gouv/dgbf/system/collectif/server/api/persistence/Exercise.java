package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Exercise extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	Short getYear();
	Exercise setYear(Short year);

	String NAME = "Exercice";
}