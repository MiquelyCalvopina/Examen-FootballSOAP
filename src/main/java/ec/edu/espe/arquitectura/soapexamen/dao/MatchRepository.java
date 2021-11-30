package ec.edu.espe.arquitectura.soapexamen.dao;

import ec.edu.espe.arquitectura.soapexamen.ws.Match;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;


public interface MatchRepository extends JpaRepository<Match,String> {

    List<Match> findByStartDateTimeAfterOrderByDateTimeDesc(LocalDateTime today);

}
