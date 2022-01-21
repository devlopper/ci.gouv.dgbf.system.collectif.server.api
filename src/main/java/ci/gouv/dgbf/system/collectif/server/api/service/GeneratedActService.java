package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(GeneratedActService.PATH)
@Tag(name = "Actes générés",description = "Gestion des actes générés")
public interface GeneratedActService extends org.cyk.utility.service.SpecificService<GeneratedActDto> {
	String PATH = "actes_generes";
	
}