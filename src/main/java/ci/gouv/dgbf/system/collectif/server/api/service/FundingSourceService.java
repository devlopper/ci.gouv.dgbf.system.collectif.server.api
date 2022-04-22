package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(FundingSourceService.PATH)
public interface FundingSourceService extends org.cyk.utility.service.SpecificService<FundingSourceDto> {
	String PATH = "sources-financements";
}