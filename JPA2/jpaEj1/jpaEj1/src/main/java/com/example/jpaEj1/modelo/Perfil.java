package com.example.jpaEj1.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Perfil {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @OneToOne
    @JoinColumn(name = "socio_id")
    private Socio socio;


}
