package fr.idmc.sid.resource;

import fr.idmc.sid.entity.Seance;
import fr.idmc.sid.repository.SeanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "seances", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class SeanceResource {
    private final SeanceRepository seanceRepository;

    @GetMapping
    public Iterable<Seance> findAll() {
        return seanceRepository.findAll();
    }
}
