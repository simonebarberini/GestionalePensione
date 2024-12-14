package com.example.GestionalePensione.repository;

import com.example.GestionalePensione.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByNomeAndCognome(String nome, String cognome);

}


