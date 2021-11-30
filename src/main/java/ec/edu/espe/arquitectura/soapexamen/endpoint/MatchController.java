package ec.edu.espe.arquitectura.soapexamen.endpoint;

import ec.edu.espe.arquitectura.soapexamen.exception.MatchException;
import ec.edu.espe.arquitectura.soapexamen.service.MatchService;
import ec.edu.espe.arquitectura.soapexamen.ws.GetAvailableMatchesRequest;
import ec.edu.espe.arquitectura.soapexamen.ws.GetAvailableMatchesResponse;
import ec.edu.espe.arquitectura.soapexamen.ws.Match;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Endpoint
@Slf4j
public class MatchController {

    private static final String NAMESPACE_URI = "http://espe.edu.ec/arquitectura/soapexamen/ws";

    @Autowired
    private MatchService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAvailableMatchesRequest")
    @ResponsePayload
    public GetAvailableMatchesResponse getAvailableMatches(@RequestPayload GetAvailableMatchesRequest request) throws MatchException {
        try {
            LocalDateTime todaysDate = LocalDateTime.now();
            List<Match> matches = this.service.findAvailableMatches(todaysDate);
            GetAvailableMatchesResponse response = new GetAvailableMatchesResponse();
            response.setMatches(matches);
            return response;
        }catch(Exception e){
            throw new MatchException("Error getting matches - " + e.getMessage());
        }
    }
}
