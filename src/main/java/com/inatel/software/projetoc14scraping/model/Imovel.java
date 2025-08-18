package com.inatel.software.projetoc14scraping.model;

public class Imovel {
    private String titulo;
    private String preco;
    private String imagem;

    private String imobiliaria;

    public Imovel() {}

    public Imovel(String titulo, String preco, String imagem, String imobiliaria) {
        this.titulo = titulo;
        this.preco = preco;
        this.imagem = imagem;
        this.imobiliaria = imobiliaria;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                ", titulo='" + titulo + '\'' +
                ", preco='" + preco + '\'' +
                ", imagem='" + imagem + '\'' +
                ", imobiliaria='" + imobiliaria + '\'' +
                '}';
    }

    public String getTitulo() { return titulo; }
    public String getPreco() { return preco; }
    public String getImagem() { return imagem; }
    public String getImobiliaria() { return imobiliaria; }
}