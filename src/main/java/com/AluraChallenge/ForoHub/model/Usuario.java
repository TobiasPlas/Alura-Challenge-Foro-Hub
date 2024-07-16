package com.AluraChallenge.ForoHub.model;

import com.AluraChallenge.ForoHub.dto.UsuarioDto;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String mail;

    private String password;

    @Transient
    @OneToMany(mappedBy = "autor")
    private List<Topico> topico;

    @Transient
    @OneToMany(mappedBy = "autor")
    private List<Respuesta> respuesta;


    public Usuario(UsuarioDto usuarioDto){
        this.mail=usuarioDto.mail();
        this.nombre=usuarioDto.nombre();
        this.password=usuarioDto.password();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return nombre;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

