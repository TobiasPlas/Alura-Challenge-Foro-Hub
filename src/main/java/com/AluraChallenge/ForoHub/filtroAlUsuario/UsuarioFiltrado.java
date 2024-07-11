package com.AluraChallenge.ForoHub.filtroAlUsuario;

import com.AluraChallenge.ForoHub.model.Usuario;

public record UsuarioFiltrado(String nombre, String mail) {

    public UsuarioFiltrado(Usuario usuario){
        this(usuario.getNombre(),usuario.getMail());
    }
}
