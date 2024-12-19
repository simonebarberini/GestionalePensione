package com.gestionalePensione.controller;

import com.gestionalePensione.model.Prenotazione;
import com.gestionalePensione.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PrenotazioneController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @GetMapping("/prenotazioni")
    public List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneService.getAllPrenotazioni();
    }

    @PostMapping("/inserisciPrenotazione")
    public void addPrenotazione(@RequestParam String nomeCliente, int numeroCani, LocalDate dataInizio, LocalDate dataFine){
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setNomeCliente(nomeCliente);
        prenotazione.setNumeroCani(numeroCani);
        prenotazione.setDataInizio(dataInizio);
        prenotazione.setDataFine(dataFine);
        prenotazioneService.addPrenotazione(prenotazione);
    }


}
