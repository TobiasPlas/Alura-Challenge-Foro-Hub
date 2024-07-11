package com.AluraChallenge.ForoHub.dto;

import com.AluraChallenge.ForoHub.model.Respuesta;
import com.AluraChallenge.ForoHub.model.Topico;
import com.AluraChallenge.ForoHub.model.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record TopicoDto (
        @NotBlank(message = "El título no puede estar vacío")
        String titulo,
        @NotBlank(message = "El mensaje no puede estar vacío")
        String mensaje,
        @NotBlank(message = "La fecha no puede estar vacío")
        String fechaCreacion,
        @NotNull(message = "El usuario no puede ser null")
        @Valid
        Usuario autor,
        @NotBlank(message = "El status no puede estar vacío")
        String status,
        @NotBlank(message = "El curso no puede estar vacío")
        String curso,
        @Valid
        List<Respuesta> respuestas) {




}