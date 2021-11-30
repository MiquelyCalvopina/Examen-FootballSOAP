package ec.edu.espe.arquitectura.soapexamen.service;

import ec.edu.espe.arquitectura.soapexamen.dao.LocationRepository;
import ec.edu.espe.arquitectura.soapexamen.exception.LocationException;
import ec.edu.espe.arquitectura.soapexamen.ws.Location;
import ec.edu.espe.arquitectura.soapexamen.ws.Match;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAvailableLocationsInMatch(String matchCode){
        return this.locationRepository.findByMatchCodeAndAvailableGreaterThan(matchCode, BigDecimal.ZERO);
    }

    public Optional<Location> obtainByMatchChodeAndLocationCode(String match, String location){
        return this.locationRepository.findByLocationCodeAndMatchCode(location,match);
    }
    @Transactional
    public String buyTicket(String matchCode, String locationCode) throws LocationException {
        Optional<Location> locationOpt = this.obtainByMatchChodeAndLocationCode(matchCode,locationCode);
        if(!locationOpt.isPresent()){
            Location location = locationOpt.get();
            location.setAvailable(location.getAvailable().subtract(BigDecimal.ONE));
            this.locationRepository.save(location);
            return "OK";
        }else{
            throw new LocationException("Cant find location with code: " + locationCode + ", and match code: " + matchCode);
        }
    }
}
