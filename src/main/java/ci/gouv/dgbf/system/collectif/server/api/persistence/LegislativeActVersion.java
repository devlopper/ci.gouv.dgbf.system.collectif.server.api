package ci.gouv.dgbf.system.collectif.server.api.persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import lombok.Getter;

public interface LegislativeActVersion extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	LegislativeAct getAct();
	LegislativeActVersion setAct(LegislativeAct act);
	
	String getActIdentifier();
	LegislativeActVersion setActIdentifier(String actIdentifier);
	
	Byte getNumber();
	LegislativeActVersion setNumber(Byte number);
	
	LocalDateTime getCreationDate();
	LegislativeActVersion setCreationDate(LocalDateTime creationDate);
	
	LocalDate getActDate();
	LegislativeActVersion setActDate(LocalDate actDate);
	
	String NAME = "Version collectif budgétaire";
	String NAME_PLURAL = "Versions collectifs budgétaires";
	
	/**/
	
	String PROCESSING_VALUE_EXPENDITURES_IMPORTATION = "IMPORTATION_DEPENSES";
	String PROCESSING_VALUE_DUPLICATION = "DUPLICATION";
	String PROCESSING_VALUE_COPY = "COPIE";
	
	@Getter
	public static enum Processing {
		/**
		 * This is an act to cancel a previously passed act
		 */
		EXPENDITURES_IMPORTATION(PROCESSING_VALUE_EXPENDITURES_IMPORTATION),
		/**This is an act to reposition a cancelled act
		 * 
		 */
		DUPLICATION(PROCESSING_VALUE_DUPLICATION),
		/**
		 * This is an act to consider made adjustments
		 */
		COPY(PROCESSING_VALUE_COPY)
		
		;
		
		private String value;
		
		private Processing(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
		
		/**/
		
		public static Processing getFromValue(String value) {
	        switch (value) {
	        case PROCESSING_VALUE_EXPENDITURES_IMPORTATION: return Processing.EXPENDITURES_IMPORTATION;
	        case PROCESSING_VALUE_DUPLICATION: return Processing.DUPLICATION;
	        case PROCESSING_VALUE_COPY: return Processing.COPY;
	        default: throw new IllegalArgumentException(String.format("value [%s] not supported.", value) );
	        }
	    }
	}
}