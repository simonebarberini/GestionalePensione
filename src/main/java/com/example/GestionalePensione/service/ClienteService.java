package com.example.GestionalePensione.service;

import com.example.GestionalePensione.model.Cliente;
import com.example.GestionalePensione.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvaCliente(Cliente cliente) {
        Optional<Cliente> clienteEsistente = clienteRepository.findByNomeAndCognome(
                cliente.getNome(), cliente.getCognome()
        );

        if (clienteEsistente.isPresent()) {
            System.out.println("Cliente esistente trovato: " + clienteEsistente.get().getId());
            return clienteEsistente.get();
        } else {
            System.out.println("Creazione di un nuovo cliente: " + cliente.getNome() + " " + cliente.getCognome());
            return clienteRepository.save(cliente);
        }
    }


    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElseThrow(()-> new RuntimeException("Cliente non trovato"));
    }
}
