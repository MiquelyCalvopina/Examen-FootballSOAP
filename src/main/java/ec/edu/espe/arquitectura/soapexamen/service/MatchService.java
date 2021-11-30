package ec.edu.espe.arquitectura.soapexamen.service;

import ec.edu.espe.arquitectura.soapexamen.dao.MatchRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.espe.arquitectura.soapexamen.ws.Match;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class MatchService {

    @Autowired
    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> findAvailableMatches(LocalDateTime date){
        return this.matchRepository.findByStartDateTimeAfterOrderByDateTimeDesc(date);
    }
}
