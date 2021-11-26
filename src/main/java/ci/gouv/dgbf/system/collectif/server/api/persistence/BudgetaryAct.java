package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface BudgetaryAct extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getSignatory();
	BudgetaryAct setSignatory(String signatory);
	
	String getReference();
	BudgetaryAct setReference(String reference);
	
	LocalDateTime getCreationDate();
	BudgetaryAct setCreationDate(LocalDateTime creationDate);
	/*
	Collection<BudgetaryActVersion> getVersions();
	BudgetaryAct setVersions(Collection<BudgetaryActVersion> versions);
	*/
}