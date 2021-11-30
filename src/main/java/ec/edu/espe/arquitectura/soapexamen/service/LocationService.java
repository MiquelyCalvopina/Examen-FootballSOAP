package ec.edu.espe.arquitectura.soapexamen.service;

import ec.edu.espe.arquitectura.soapexamen.dao.LocationRepository;
import ec.edu.espe.arquitectura.soapexamen.ws.Location;
import ec.edu.espe.arquitectura.soapexamen.ws.Match;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAvailableLocationsInMatch(String matchCode){
        return this.locationRepository.findByMatchCodeAndAvailableGreaterThan(matchCode, BigDecimal.ZERO);
    }
}
