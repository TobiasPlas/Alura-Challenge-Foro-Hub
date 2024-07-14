package com.AluraChallenge.ForoHub.model;

import com.AluraChallenge.ForoHub.dto.UsuarioDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
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


    public Usuario(UsuarioDto usuarioDto){
        this.mail=usuarioDto.mail();
        this.nombre=usuarioDto.nombre();
        this.password=usuarioDto.password();
    }

}

