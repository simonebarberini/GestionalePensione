package com.gestionalePensione.repo;

import com.gestionalePensione.model.Prenotazione;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends MongoRepository<Prenotazione, Long> {
}
