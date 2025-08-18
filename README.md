# Projeto C14 - WebScraping

Este projeto é uma aplicação **Spring Boot** desenvolvida em **Java** que realiza **WebScraping** utilizando a biblioteca [Jsoup](https://jsoup.org/).  
O objetivo é coletar informações de imóveis disponíveis no site da **Imobiliária Cardoso Andrade** e estruturá-las em objetos Java para posterior utilização (como API, persistência em banco de dados ou visualização em frontend). oiiiiiii

---

## 🚀 Tecnologias Utilizadas

- **Java 21** (ou versão compatível configurada no Maven)
- **Spring Boot**
- **Maven**
- **Jsoup**

---

## 📂 Estrutura do Projeto

```
src/
├─ main/
│ ├─ java/com/inatel/software/projetoc14scraping/
│ │ ├─ model/Imovel.java # Classe que representa os dados de um imóvel
│ │ ├─ service/ScraperService.java # Serviço responsável pelo scraping
│ │ └─ ProjetoC14ScrapingApplication.java # Classe principal do Spring Boot
│ └─ resources/
│ └─ application.properties # Configurações do projeto
```

---

## ⚙️ Configuração e Instalação

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/projeto-c14-webscraping.git
cd projeto-c14-webscraping
```

### 2. Importar na IDE

Você pode abrir o projeto em qualquer IDE compatível com Maven, como:

IntelliJ IDEA

Eclipse

VS Code (com extensões Java)

### 3. Verificar dependências Maven

O arquivo pom.xml já contém as dependências necessárias, incluindo:

```xml
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.17.2</version>
</dependency>
```

Se necessário, execute:

```bash
mvn clean install
```

### ▶️ Executando o Projeto

#### 1. Via IDE

Localize a classe ProjetoC14ScrapingApplication.java

Clique em Run

#### 2. Via Maven
```bash
mvn spring-boot:run
```


#### 3. Via JAR

```bash
mvn clean package
java -jar target/projeto-c14-scraping-0.0.1-SNAPSHOT.jar
```