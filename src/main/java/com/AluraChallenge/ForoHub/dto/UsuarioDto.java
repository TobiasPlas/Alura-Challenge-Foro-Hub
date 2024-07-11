package com.AluraChallenge.ForoHub.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Valid
public record UsuarioDto(
        @NotBlank(message = "El nombre no puede estar vacío")
        String nombre,
        @NotBlank(message = "El mail no puede estar vacío")
        @Email
        String mail,
        @NotBlank(message = "La contraseña no puede estar vacío")
        String password) {
}
