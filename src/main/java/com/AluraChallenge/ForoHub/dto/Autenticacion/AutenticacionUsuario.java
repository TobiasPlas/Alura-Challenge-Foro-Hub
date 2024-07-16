package com.AluraChallenge.ForoHub.dto.Autenticacion;

import jakarta.validation.constraints.NotBlank;

public record AutenticacionUsuario(
        @NotBlank
        String usuario,
        @NotBlank
        String password) {
}
