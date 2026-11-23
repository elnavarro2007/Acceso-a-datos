package com.example.ejerciciosConsultas.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
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


    @OneToMany
    private List<Coche> coches = new ArrayList<>();


}
