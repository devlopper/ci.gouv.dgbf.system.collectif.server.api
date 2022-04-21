package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetCategory extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String NAME = "Catégorie de budget";
	String INITIALS = "C.B.";
}