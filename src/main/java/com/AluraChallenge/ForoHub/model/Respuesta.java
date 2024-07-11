package com.AluraChallenge.ForoHub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "Topico_id")
    private Topico topico;

    private String fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "Autor_id")
    private Usuario autor;

    private String solucion;

}
