package com.example.ejerciciosConsultas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Revision {
    // codigo, cambio_filtro, cambio_aceite, coste, coche_id

    @Id
    @Column(nullable = false)
    private String codigo;
    private int cambio_filtro;
    private int cambio_aceite;
    private double coste;

    @ManyToOne(optional = false)
    @JoinColumn(name = "coche_id")
    private Coche coche;

}
