package com.example.GestionalePensione.controller;

import com.example.GestionalePensione.model.Cliente;
import com.example.GestionalePensione.model.Prenotazione;
import com.example.GestionalePensione.service.ClienteService;
import com.example.GestionalePensione.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private final PrenotazioneService prenotazioneService;
    @Autowired
    private final ClienteService clienteService;

    public PrenotazioneController(PrenotazioneService prenotazioneService, ClienteService clienteService) {
        this.prenotazioneService = prenotazioneService;
        this.clienteService = clienteService;
    }


    @PostMapping("/salvaPrenotazione")
    public String salvaPrenotazione(Prenotazione prenotazione) {
        System.out.println("Salvataggio della prenotazione per il cliente: " + prenotazione.getCliente().getNome());

        Cliente cliente = clienteService.salvaCliente(prenotazione.getCliente());
        prenotazione.setCliente(cliente);

        prenotazioneService.salvaPrenotazione(prenotazione);
        System.out.println("Prenotazione salvata correttamente!");

        return "redirect:/home";
    }

}