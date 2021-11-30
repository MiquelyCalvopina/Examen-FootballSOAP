package ec.edu.espe.arquitectura.soapexamen.endpoint;

import ec.edu.espe.arquitectura.soapexamen.exception.LocationException;
import ec.edu.espe.arquitectura.soapexamen.exception.MatchException;
import ec.edu.espe.arquitectura.soapexamen.service.LocationService;
import ec.edu.espe.arquitectura.soapexamen.service.MatchService;
import ec.edu.espe.arquitectura.soapexamen.ws.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDateTime;
import java.util.List;

@Endpoint
@Slf4j
public class LocationController {

    private static final String NAMESPACE_URI = "http://espe.edu.ec/arquitectura/soapexamen/ws";

    @Autowired
    private LocationService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAvailableMatchesRequest")
    @ResponsePayload
    public GetLocationsMatchResponse getAvailableLocations (@RequestPayload GetLocationsMatchRequest request) throws LocationException {
        try {
            List<Location> locations = this.service.findAvailableLocationsInMatch(request.getMatchCode());
            GetLocationsMatchResponse response = new GetLocationsMatchResponse();
            response.setLocationsMatches(locations);
            return response;
        }catch (Exception e){
            throw new LocationException("Error - " + e.getMessage());
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "actualizarProductoRequest")
    @ResponsePayload
    public BuyLocationMatchResponse buyLocationTicket(@RequestPayload BuyLocationMatchRequest request) throws LocationException {
        try{
            this.service.buyTicket(request.getMatchCode(),request.getLocationCode());
            BuyLocationMatchResponse response = new BuyLocationMatchResponse();
            response.setLocation("Done!");
            return response;
        }catch(Exception e){
            throw new LocationException("Error - " + e.getMessage());
        }
    }
}
