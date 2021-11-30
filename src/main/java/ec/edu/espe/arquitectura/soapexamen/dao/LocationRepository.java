package ec.edu.espe.arquitectura.soapexamen.dao;

import ec.edu.espe.arquitectura.soapexamen.ws.Location;
import ec.edu.espe.arquitectura.soapexamen.ws.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface LocationRepository extends JpaRepository<Location,String> {

    public List<Location> findByMatchCodeAndAvailableGreaterThan(String matchCode, BigDecimal available);

}
