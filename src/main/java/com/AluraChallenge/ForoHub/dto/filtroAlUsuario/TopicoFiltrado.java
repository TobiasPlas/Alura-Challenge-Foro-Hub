package com.AluraChallenge.ForoHub.dto.filtroAlUsuario;

import com.AluraChallenge.ForoHub.model.Respuesta;
import com.AluraChallenge.ForoHub.model.Topico;

import java.util.List;

public record TopicoFiltrado(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        UsuarioFiltrado Usuario,
        List<Respuesta> respuestas,
        String curso) {

    public TopicoFiltrado(Topico topico) {
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), new UsuarioFiltrado(topico.getAutor()),topico.getRespuestas(),topico.getCurso());
    }

}
