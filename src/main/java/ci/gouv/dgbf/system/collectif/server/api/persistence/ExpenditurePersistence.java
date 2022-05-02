package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.util.Collection;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ExpenditurePersistence extends SpecificPersistence<Expenditure> {

	Collection<Expenditure> readFromFileExcel(byte[] bytes,Integer activityCodeColumnIndex,Integer economicNatureCodeColumnIndex,Integer fundingSourceCodeColumnIndex,Integer lessorCodeColumnIndex);
	
}