package ec.edu.espe.arquitectura.soapexamen.endpoint;

import ec.edu.espe.arquitectura.soapexamen.service.LocationService;
import ec.edu.espe.arquitectura.soapexamen.service.MatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
@Slf4j
public class LocationController {

    private static final String NAMESPACE_URI = "http://espe.edu.ec/arquitectura/soapexamen/ws";

    @Autowired
    private LocationService service;

    
}
