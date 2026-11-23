package com.example.ejerciciosConsultas.modelo;

import jakarta.persistence.*;
import lombok.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
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



}
