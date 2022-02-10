package com.example.springgraphql.mysql.controllers;

import com.example.springgraphql.mysql.model.Telefone;
import com.example.springgraphql.mysql.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/telefone")
public class TelefoneController {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Telefone novoSegurado(@Validated Telefone telefone){
        telefoneRepository.save(telefone);
        return telefone;
    }

    /**
     * @Request
     */
    @GetMapping("/v1/api/findAllTelefone")
    public Iterable<Telefone> obterTelefone() {
        return telefoneRepository.findAll();
    }

    @GetMapping("/v1/api/findById/{seguradoUID}")
    public Optional<Telefone> obterTelefoneId(@PathVariable Long telefoneUID){
        return telefoneRepository.findById(telefoneUID);
    }

}
