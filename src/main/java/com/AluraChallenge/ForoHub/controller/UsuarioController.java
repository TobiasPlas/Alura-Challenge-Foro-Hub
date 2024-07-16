package com.AluraChallenge.ForoHub.controller;


import com.AluraChallenge.ForoHub.dto.UsuarioDto;
import com.AluraChallenge.ForoHub.dto.filtroAlUsuario.UsuarioFiltrado;
import com.AluraChallenge.ForoHub.service.Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private Service service;


    @PostMapping("/crear")
    public ResponseEntity<UsuarioFiltrado> saveUsuario(@RequestBody @Valid UsuarioDto usuarioDto, UriComponentsBuilder uriComponentsBuilder){
        UsuarioFiltrado usuario=service.saveUsuario(usuarioDto);
        URI url=uriComponentsBuilder.path("/user/id={id}").buildAndExpand(usuario.id()).toUri();
        return ResponseEntity.created(url).body(usuario);
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioFiltrado>> getUsers(){
        return ResponseEntity.ok(service.findAllUser());
    }

    @GetMapping("/id={id}")
    public ResponseEntity<UsuarioFiltrado> findUserById(@PathVariable Long id){
        return ResponseEntity.ok(service.findUserById(id));
    }
}
