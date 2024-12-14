package com.example.GestionalePensione.controller;

import com.example.GestionalePensione.model.Cliente;
import com.example.GestionalePensione.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clienti")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente creaCliente(@RequestBody Cliente cliente) {
        return clienteService.salvaCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

}
