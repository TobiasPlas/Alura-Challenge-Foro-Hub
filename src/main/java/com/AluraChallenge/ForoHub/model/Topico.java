package com.AluraChallenge.ForoHub.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String titulo;

    private String mensaje;

    private String fechaCreacion;

    private String status;

    @ManyToOne()
    @JoinColumn(name = "Autor_id")
    private Usuario autor;

    @OneToMany(mappedBy = "id")
    private List<Respuesta> respuestas;

}
