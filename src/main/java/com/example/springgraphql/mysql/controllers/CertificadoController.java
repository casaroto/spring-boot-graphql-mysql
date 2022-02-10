package com.example.springgraphql.mysql.controllers;

import br.com.bradescoseguros.Backend.entity.Certificado;
import br.com.bradescoseguros.Backend.repositories.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/certificado")
public class CertificadoController {

    @Autowired
    private CertificadoRepository certificadoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Certificado novoCertificado(@Validated Certificado certificado){
        certificadoRepository.save(certificado);
        return certificado;
    }

    /**
     * @Request
     */
    @GetMapping("/v1/api/findAllCertificado")
    public Iterable<Certificado> obterCertificado() {
        return certificadoRepository.findAll();
    }

    @GetMapping("/v1/api/findById/{certificadoUID}")
    public Optional<Certificado> obterCertificadoId(@PathVariable Long certificadoUID){
        return certificadoRepository.findById(certificadoUID);
    }

}
