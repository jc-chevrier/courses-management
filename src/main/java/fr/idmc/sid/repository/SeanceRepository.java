package fr.idmc.sid.repository;

import fr.idmc.sid.entity.Seance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends CrudRepository<Seance, Long> {}
