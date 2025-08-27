package com.inatel.software.projetoc14scraping.service;

import com.inatel.software.projetoc14scraping.model.Imovel.Imovel;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScraperService {

    public List<Imovel> scrape() {
        List<Imovel> imoveis = new ArrayList<>();
        String url = "https://imobiliariacardosoandrade.com.br/index/buscaavancada/finalidade/2/cidade/5";

        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .timeout(30000)
                    .get();

            Elements propertyBoxes = doc.select(".item-box");

            for (Element box : propertyBoxes) {
                String titulo = box.selectFirst("h1").text();

                String preco = "Preço não disponível";
                if (box.select("h4").size() > 1) {
                    Element precoElement = box.select("h4").get(1).selectFirst(".pull-left");
                    if (precoElement != null) {
                        preco = precoElement.text();
                    }
                }

                String imagem = box.selectFirst("img") != null ?
                        box.selectFirst("img").attr("src") :
                        "sem-imagem.jpg";

                imoveis.add(new Imovel(titulo, preco, imagem, "Cardoso Andrade"));
            }

        } catch (IOException e) {
            System.err.println("Erro ao fazer scraping: " + e.getMessage());
        }

        return imoveis;
    }
}