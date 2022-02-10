package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
