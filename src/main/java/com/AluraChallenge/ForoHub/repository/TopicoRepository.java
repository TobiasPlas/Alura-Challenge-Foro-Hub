package com.AluraChallenge.ForoHub.repository;

import com.AluraChallenge.ForoHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico,Long> {

    @Query("SELECT t FROM Topico t WHERE t.curso ILIKE %:curso%")
    public List<Topico> findByCurso(String curso);

    @Query("SELECT t FROM Topico t JOIN t.autor u WHERE u.nombre ILIKE %:nombre%")
    public List<Topico>findByNombre(String nombre);
}
