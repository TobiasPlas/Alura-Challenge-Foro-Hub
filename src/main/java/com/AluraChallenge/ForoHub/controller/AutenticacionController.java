package com.AluraChallenge.ForoHub.controller;

import com.AluraChallenge.ForoHub.dto.Autenticacion.AutenticacionUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {


    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity autenticarUsuario(AutenticacionUsuario usuario){
        Authentication token=new UsernamePasswordAuthenticationToken(usuario.usuario(),usuario.password());
        authenticationManager.authenticate(token);

        return ResponseEntity.ok().build();
    }
}
