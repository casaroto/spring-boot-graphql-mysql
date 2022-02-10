package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Segurado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguradoRepository extends JpaRepository<Segurado, Long> {
}
