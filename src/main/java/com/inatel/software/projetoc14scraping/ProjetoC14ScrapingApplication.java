package com.inatel.software.projetoc14scraping;

import com.inatel.software.projetoc14scraping.model.Imovel;
import com.inatel.software.projetoc14scraping.service.ScraperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjetoC14ScrapingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjetoC14ScrapingApplication.class, args);

        ScraperService scraperService = new ScraperService();
        List<Imovel> imoveis = scraperService.scrape();
        for (Imovel imovel : imoveis) {
            System.out.println("Imovel: " +  imovel.toString() ); // imovel encontrado
        }

    }

}
