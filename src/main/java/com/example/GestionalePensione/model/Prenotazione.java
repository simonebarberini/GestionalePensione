package com.example.GestionalePensione.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.time.LocalDate;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInizioPrenotazione;
    private LocalDate dataFinePrenotazione;
    private String box;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public LocalDate getDataFinePrenotazione() {
        return dataFinePrenotazione;
    }

    public void setDataFinePrenotazione(LocalDate dataFinePrenotazione) {
        this.dataFinePrenotazione = dataFinePrenotazione;
    }

    public LocalDate getDataInizioPrenotazione() {
        return dataInizioPrenotazione;
    }

    public void setDataInizioPrenotazione(LocalDate dataInizioPrenotazione) {
        this.dataInizioPrenotazione = dataInizioPrenotazione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
