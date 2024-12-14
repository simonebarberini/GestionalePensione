package com.example.GestionalePensione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller()
public class HomeController {

    @GetMapping("/home")
    public String homeView(){
        return "home";
    }

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
