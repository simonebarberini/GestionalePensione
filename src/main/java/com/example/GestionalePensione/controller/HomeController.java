package com.example.GestionalePensione.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/prenotazioni")
    public String prenotazioniView() {
        return "prenotazioni";
    }

    @GetMapping("/nuovaPrenotazione")
    public String nuovaPrenotazioneView() {
        return "nuovaPrenotazione";
    }

    @GetMapping("/calendarioPrenotazioni")
    public String calendarioPrenotazioniView() {
        return "calendarioPrenotazioni";
    }
}
