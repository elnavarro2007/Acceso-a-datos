package com.example.ejerciciosConsultas.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


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


}
