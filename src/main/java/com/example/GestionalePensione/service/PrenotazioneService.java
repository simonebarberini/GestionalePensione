package com.example.GestionalePensione.service;

import com.example.GestionalePensione.model.Prenotazione;
import com.example.GestionalePensione.repository.PrenotazioneRepository;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    private final PrenotazioneRepository prenotazioneRepository;
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    public Prenotazione salvaPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }
}
