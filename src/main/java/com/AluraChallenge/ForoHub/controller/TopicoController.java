package com.AluraChallenge.ForoHub.controller;

import com.AluraChallenge.ForoHub.dto.TopicoDto;
import com.AluraChallenge.ForoHub.dto.UsuarioDto;
import com.AluraChallenge.ForoHub.dto.edit.TopicoEditable;
import com.AluraChallenge.ForoHub.dto.filtroAlUsuario.TopicoFiltrado;
import com.AluraChallenge.ForoHub.dto.filtroAlUsuario.UsuarioFiltrado;
import com.AluraChallenge.ForoHub.service.Service;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private Service service;


    @PostMapping
    public ResponseEntity<TopicoFiltrado> saveTopico(@RequestBody @Valid TopicoDto topico, UriComponentsBuilder uriComponentsBuilder){
        TopicoFiltrado topicoFiltrado=service.saveTopico(topico);
        URI url=uriComponentsBuilder.path("/topico/id={id}").buildAndExpand(topicoFiltrado.id()).toUri();
        return ResponseEntity.created(url).body(topicoFiltrado);
    }

    @GetMapping()
    public ResponseEntity<List<TopicoFiltrado>> findAllTopicos(){
        return ResponseEntity.ok(service.findAllTopicos());
    }

    @GetMapping("/{curso}")
    public ResponseEntity<List<TopicoFiltrado>> findByCurso(@PathVariable String curso){
        return ResponseEntity.ok(service.findByCurso(curso));
    }

    @GetMapping("/id={id}")
    public ResponseEntity<TopicoFiltrado> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }


    @GetMapping("/{nombre}")
    public ResponseEntity<List<TopicoFiltrado>> findById(@PathVariable String nombre){
        return ResponseEntity.ok(service.findByNombre(nombre));
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoFiltrado> editarTopico(@PathVariable Long id,
                              @RequestBody @Valid TopicoEditable topicoEditable){
        TopicoFiltrado topicoFiltrado = service.editarTopico(id, topicoEditable);
        return ResponseEntity.ok(topicoFiltrado);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }





}
