package com.gestionalePensione.controller;

import com.gestionalePensione.model.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    PrenotazioneController prenotazioneController;

    @GetMapping("/")
    public String redirectToHome(){
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/listaPrenotazioni")
    public String listaPrenotazioni(Model model){
        List<Prenotazione> prenotazioni = prenotazioneController.getAllPrenotazioni();
        model.addAttribute("prenotazioni", prenotazioni);
        return "listaPrenotazioni";
    }

    @GetMapping("/nuovaPrenotazione")
    public String inserisciPrenotazione(){
        return "nuovaPrenotazione";
    }
}
