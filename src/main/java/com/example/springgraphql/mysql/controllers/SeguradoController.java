package com.example.springgraphql.mysql.controllers;

import com.example.springgraphql.mysql.model.Segurado;
import com.example.springgraphql.mysql.repository.SeguradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/segurado")
public class SeguradoController {

    @Autowired
    private SeguradoRepository seguradoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Segurado novoSegurado(@Validated Segurado segurado){
        seguradoRepository.save(segurado);
        return segurado;
    }

    /**
     * @Request
     */
    @GetMapping("/v1/api/findAllSegurado")
    public Iterable<Segurado> obterSegurado() {
        return seguradoRepository.findAll();
    }

    @GetMapping("/v1/api/findById/{seguradoUID}")
    public Optional<Segurado> obterSeguradoId(@PathVariable Long seguradoUID){
        return seguradoRepository.findById(seguradoUID);
    }
}
