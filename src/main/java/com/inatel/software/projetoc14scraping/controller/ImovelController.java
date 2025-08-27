package com.inatel.software.projetoc14scraping.controller;

import com.inatel.software.projetoc14scraping.model.Imovel.Imovel;
import com.inatel.software.projetoc14scraping.model.Imovel.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {

    @Autowired
    private ImovelRepository repository;

    @GetMapping
    public List<Imovel> getAllImoveis() {
        return repository.findAll();
    }

    @GetMapping("/busca")
    public List<Imovel> searchImoveis(@RequestParam String titulo) {
        return repository.findByTituloContainingIgnoreCase(titulo);
    }

    @GetMapping("/imobiliaria/{nomeImobiliaria}")
    public List<Imovel> getImoveisByImobiliaria(@PathVariable String nomeImobiliaria) {
        return repository.findByImobiliaria(nomeImobiliaria);
    }
}