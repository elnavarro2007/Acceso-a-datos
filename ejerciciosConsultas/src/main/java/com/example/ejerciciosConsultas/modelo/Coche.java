package com.example.ejerciciosConsultas.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class Coche {
    // matricula, marca, modelo, color, precio, cliente_id
    @Id
    @Column(nullable = false)
    private String matricula;

    private String marca;
    private String modelo;
    private String color;
    private double precio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // ponerle el atributo de revision, que se llama coche y asi no se generan tablas intermedias
    @OneToMany ( mappedBy = "coche")
    private List<Revision> revisionList = new ArrayList<>();

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", cliente=" + cliente.getNombre() +
                ", revisionList=" + revisionList +
                '}';
    }
}
