package com.AluraChallenge.ForoHub.service;

import com.AluraChallenge.ForoHub.dto.TopicoDto;
import com.AluraChallenge.ForoHub.edit.TopicoEditable;
import com.AluraChallenge.ForoHub.filtroAlUsuario.TopicoFiltrado;
import com.AluraChallenge.ForoHub.model.Topico;
import com.AluraChallenge.ForoHub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repositoryT;

    public void saveTopico(@Valid TopicoDto topico) {
        Topico topicoDatos = new Topico(topico);
        repositoryT.save(topicoDatos);
    }

    public List<TopicoFiltrado> findAllTopicos() {
        return repositoryT.findAll().stream().map(TopicoFiltrado::new).toList();
    }


    public List<TopicoFiltrado> findByCurso(String curso) {
        return repositoryT.findByCurso(curso).stream().map(TopicoFiltrado::new).toList();
    }

    public TopicoFiltrado findById(Long id) {

        return new TopicoFiltrado(repositoryT.findById(id).orElse(null));

    }

    public List<TopicoFiltrado> findByNombre(String nombre) {

        return repositoryT.findByNombre(nombre).stream().map(TopicoFiltrado::new).toList();
    }

    public void editarTopico(Long id, TopicoEditable topicoEditable) {
        Topico topico = repositoryT.getReferenceById((Long) id);
        topico.editarTopico(topicoEditable);
        repositoryT.save(topico);
    }

    public void deleteById(Long id) {
            repositoryT.deleteById(id);

    }

}

