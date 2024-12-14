package com.example.GestionalePensione.model;

import java.time.LocalDate;
import java.util.Map;

public class GiorniDisponibili {
    private Map<LocalDate, Integer> caniPrenotatiPerGiorno;

    public Map<LocalDate, Integer> getCaniPrenotatiPerGiorno() {
        return caniPrenotatiPerGiorno;
    }

    public void setCaniPrenotatiPerGiorno(Map<LocalDate, Integer> caniPrenotatiPerGiorno) {
        this.caniPrenotatiPerGiorno = caniPrenotatiPerGiorno;
    }

    public void aggiungiPrenotazione(LocalDate giorno, int numeroCani) {
        caniPrenotatiPerGiorno.put(giorno, caniPrenotatiPerGiorno.getOrDefault(giorno, 0) + numeroCani);
    }
}
