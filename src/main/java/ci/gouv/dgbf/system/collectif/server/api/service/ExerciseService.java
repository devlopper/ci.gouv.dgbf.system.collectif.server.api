package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(ExerciseService.PATH)
public interface ExerciseService extends org.cyk.utility.service.SpecificService<ExerciseDto> {
	String PATH = "exercice";
}