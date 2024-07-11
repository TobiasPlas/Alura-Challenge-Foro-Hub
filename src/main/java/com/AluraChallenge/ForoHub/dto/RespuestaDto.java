package com.AluraChallenge.ForoHub.dto;

import com.AluraChallenge.ForoHub.model.Topico;
import com.AluraChallenge.ForoHub.model.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RespuestaDto(

        @NotBlank
        String mensaje,
        @NotBlank
        String fechaCreacion,
        @NotNull
        @Valid
        Usuario autor) {
}
