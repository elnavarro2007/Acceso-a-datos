package com.example.ejerciciosConsultas.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class Cliente {
    // id, nif, nombre, direccion, ciudad, telefono

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nif;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;


    @OneToMany(mappedBy = "cliente")
    private List<Coche> coches = new ArrayList<>();


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
