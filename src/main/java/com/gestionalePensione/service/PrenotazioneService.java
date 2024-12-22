package com.gestionalePensione.service;

import com.gestionalePensione.model.Prenotazione;
import com.gestionalePensione.repo.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepo;

    public List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneRepo.findAll();
    }

    public void addPrenotazione(Prenotazione prenotazione) {
        try {
            prenotazioneRepo.save(prenotazione);
        }catch (Exception e){
            throw new RuntimeException("Non é stato possibile salvare la prenotazione");
        }

    }

    public void eliminaPrenotazione(String id) {
        try {
            prenotazioneRepo.deleteById(id);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("Non é stato possibile eliminare la prenotazione");
        }
    }
}
