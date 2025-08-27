package com.inatel.software.projetoc14scraping.controller;

import com.inatel.software.projetoc14scraping.model.Imovel.Imovel;
import com.inatel.software.projetoc14scraping.model.Imovel.ImovelRepository;
import com.inatel.software.projetoc14scraping.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
public class ScrapingController {

    @Autowired
    private ImovelRepository repository;
    
    private ScraperService scraper;

    @GetMapping("/scrape")
    public List<Imovel> scrapeAllImoveis() {

        List<Imovel> imoveis = scraper.scrape();

        repository.saveAll(imoveis);

        return imoveis;
    }
}