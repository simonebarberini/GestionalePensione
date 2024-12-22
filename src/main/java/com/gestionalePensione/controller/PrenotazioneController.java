package com.gestionalePensione.controller;

import com.gestionalePensione.model.Prenotazione;
import com.gestionalePensione.service.DisponibilitaService;
import com.gestionalePensione.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PrenotazioneController {

    private static final int NUMERO_BOX = 10;

    @Autowired
    PrenotazioneService prenotazioneService;

    @Autowired
    DisponibilitaService disponibilitaService;


    @GetMapping("/prenotazioni")
    public List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneService.getAllPrenotazioni();
    }

    @PostMapping("/nuovaPrenotazione")
    public void addPrenotazione(@RequestParam String nomeCliente, @RequestParam int numeroCani, @RequestParam String dataInizio, @RequestParam String dataFine){

        int disponibilita = disponibilitaService.verificaDisponibilita(LocalDate.parse(dataInizio), LocalDate.parse(dataFine), NUMERO_BOX);

        if (disponibilita<=0){
            throw new RuntimeException("Non ci sono box disponibili in queste date");
        }
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setNomeCliente(nomeCliente);
        prenotazione.setNumeroCani(numeroCani);
        prenotazione.setDataInizio(LocalDate.parse(dataInizio));
        prenotazione.setDataFine(LocalDate.parse(dataFine));
        prenotazioneService.addPrenotazione(prenotazione);
    }

    @GetMapping("/verificaDisponibilita")
    public Integer getDisponibilita(@RequestParam String dataInizio, @RequestParam String dataFine){
        return disponibilitaService.verificaDisponibilita(LocalDate.parse(dataInizio), LocalDate.parse(dataFine), NUMERO_BOX);
    }


}
