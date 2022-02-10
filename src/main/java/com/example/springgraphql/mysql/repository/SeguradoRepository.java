package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Segurado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;;

public interface SeguradoRepository extends JpaRepository<Segurado, Long> {

    public Iterable<Segurado> findByNomeContainingIgnoreCase(String nomeSegurado);

    @Query("SELECT s FROM Segurado s WHERE s.nomeSegurado LIKE %:nomeSegurado%")
    public Iterable<Segurado> searchByNameLike(@Param("nomeSegurado") String nomeSegurado);
}
