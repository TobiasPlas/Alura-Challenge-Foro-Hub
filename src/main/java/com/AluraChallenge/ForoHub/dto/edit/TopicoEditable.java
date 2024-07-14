package com.AluraChallenge.ForoHub.dto.edit;

import com.AluraChallenge.ForoHub.model.Topico;

public record TopicoEditable(
        String titulo,
        String mensaje,
        String curso) {

    public TopicoEditable(Topico topico){
        this(topico.getTitulo(),topico.getMensaje(),topico.getCurso());
    }
}

