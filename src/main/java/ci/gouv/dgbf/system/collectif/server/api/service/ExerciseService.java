package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ExerciseService.PATH)
@Tag(name = "Exercice")
public interface ExerciseService extends org.cyk.utility.service.MaterializedViewSpecificService<ExerciseDto> {
	String PATH = "exercices";
}