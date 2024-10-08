package com.AluraChallenge.ForoHub.controller;

import com.AluraChallenge.ForoHub.dto.Autenticacion.AutenticacionUsuario;

import com.AluraChallenge.ForoHub.infra.security.TokenService;
import com.AluraChallenge.ForoHub.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenService serviceToken;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid AutenticacionUsuario usuario){
        Authentication authToken=new UsernamePasswordAuthenticationToken(usuario.usuario(),usuario.password());
        var usuarioAutenticado =authenticationManager.authenticate(authToken);
        var JWTtoken =serviceToken.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(JWTtoken);
    }
}
