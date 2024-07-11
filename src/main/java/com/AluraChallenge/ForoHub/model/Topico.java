package com.AluraChallenge.ForoHub.model;

import com.AluraChallenge.ForoHub.dto.TopicoDto;
import com.AluraChallenge.ForoHub.edit.TopicoEditable;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    private String fechaCreacion;

    private String status;

    private String curso;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Autor_id")
    private Usuario autor;

    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;

    public Topico(TopicoDto topicoDto) {
        this.id=id;
        this.titulo = topicoDto.titulo();
        this.mensaje = topicoDto.mensaje();
        this.fechaCreacion = topicoDto.fechaCreacion();
        this.status = topicoDto.status();
        this.curso = topicoDto.curso();
        this.autor = topicoDto.autor();
        this.respuestas = topicoDto.respuestas();
    }

    public void editarTopico(TopicoEditable topicoEditable){
        if (topicoEditable.titulo()!=null){
            this.titulo=topicoEditable.titulo();
        }
        if (topicoEditable.mensaje()!=null){
            this.mensaje=topicoEditable.mensaje();
        }
        if (topicoEditable.curso()!=null){
            this.curso=topicoEditable.curso();
        }
    }
}
