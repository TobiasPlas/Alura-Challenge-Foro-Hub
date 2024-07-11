package com.AluraChallenge.ForoHub.controller;

import com.AluraChallenge.ForoHub.dto.TopicoDto;
import com.AluraChallenge.ForoHub.edit.TopicoEditable;
import com.AluraChallenge.ForoHub.filtroAlUsuario.TopicoFiltrado;
import com.AluraChallenge.ForoHub.service.TopicoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoService serviceT;

    @PostMapping
    public void saveTopico(@RequestBody @Valid TopicoDto topico){
        serviceT.saveTopico(topico);
    }

    @GetMapping()
    public List<TopicoFiltrado> findAllTopicos(){
        return serviceT.findAllTopicos();
    }

    @GetMapping("/curso={curso}")
    public List<TopicoFiltrado> findByCurso(@PathVariable String curso){
        return serviceT.findByCurso(curso);
    }

    @GetMapping("/id={id}")
    public TopicoFiltrado findById(@PathVariable Long id){
        return serviceT.findById(id);
    }


    @GetMapping("/nombre={nombre}")
    public List<TopicoFiltrado> findById(@PathVariable String nombre){
        return serviceT.findByNombre(nombre);
    }
    
    @PutMapping("/id={id}")
    public void editarTopico(@PathVariable Long id,
                              @RequestBody @Valid TopicoEditable topicoEditable){
        serviceT.editarTopico(id,topicoEditable);
    }

    @DeleteMapping("/id={id}")
    public void deleteById(@PathVariable Long id){
        serviceT.deleteById(id);
    }
}
