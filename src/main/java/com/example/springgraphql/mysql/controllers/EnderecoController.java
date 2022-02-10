package com.example.springgraphql.mysql.controllers;

import com.example.springgraphql.mysql.model.Endereco;
import com.example.springgraphql.mysql.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Endereco novoEndereco(@Validated Endereco endereco){
        enderecoRepository.save(endereco);
        return endereco;
    }

    /**
     * @Request
     */
    @GetMapping("/v1/api/findAllEndereco")
    public Iterable<Endereco> obterEndereco() {
        return enderecoRepository.findAll();
    }

    @GetMapping("/v1/api/findById/{enderecoUID}")
    public Optional<Endereco> obterEnderecoId(@PathVariable Long enderecoUID){
        return enderecoRepository.findById(enderecoUID);
    }
}
