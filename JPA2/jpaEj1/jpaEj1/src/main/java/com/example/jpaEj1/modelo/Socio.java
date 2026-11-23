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
public class Socio {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String biografia;
    private LocalDate fechaNac;
    private String preferencias;




}
