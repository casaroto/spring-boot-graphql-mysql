package com.example.springgraphql.mysql.controllers;

import br.com.bradescoseguros.Backend.entity.ApoliceAuto;
import br.com.bradescoseguros.Backend.repositories.ApoliceAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/apoliceAuto")
public class ApoliceAutoController {

    @Autowired
    private ApoliceAutoRepository apoliceAutoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody ApoliceAuto createApoliceAuto(@Validated ApoliceAuto apoliceAuto){
        apoliceAutoRepository.save(apoliceAuto);
        return apoliceAuto;
    }

    /**
     * @Request
     */
    @GetMapping("/v1/api/findAllApoliceAuto")
    public Iterable<ApoliceAuto> obterApoliceAuto() {
        return apoliceAutoRepository.findAll();
    }

    @GetMapping("/v1/api/findById/{apoliceAutoUID}")
    public Optional<ApoliceAuto> obterApoliceAutoId(@PathVariable Long apoliceAutoUID){
        return apoliceAutoRepository.findById(apoliceAutoUID);
    }

}
