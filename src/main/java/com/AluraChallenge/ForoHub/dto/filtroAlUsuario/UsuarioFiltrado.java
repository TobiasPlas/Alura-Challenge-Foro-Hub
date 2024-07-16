package com.AluraChallenge.ForoHub.dto.filtroAlUsuario;

import com.AluraChallenge.ForoHub.model.Usuario;

public record UsuarioFiltrado(Long id,String nombre, String mail) {

    public UsuarioFiltrado(Usuario usuario){
        this(usuario.getId(), usuario.getNombre(),usuario.getMail());
    }
}
