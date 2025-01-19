package com.gestionalePensione.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrenotazioneTest {

    @Test
    public void createPrenotazione(){
        Prenotazione p = new Prenotazione();
        p.setId("1");
        p.setDataFine(LocalDate.of(2025,1,19));
        p.setDataInizio(LocalDate.of(2025,1,12));
        p.setNumeroCani(2);
        p.setNomeCliente("Simone");
        assertNotNull(p);
    }

}