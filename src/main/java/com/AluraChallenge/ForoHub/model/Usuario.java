package com.AluraChallenge.ForoHub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String mail;

    private String password;

    @Transient
    @OneToMany(mappedBy = "autor")
    private List<Topico> topico;

    @Transient
    @OneToMany(mappedBy = "autor")
    private List<Respuesta> respuesta;

}

