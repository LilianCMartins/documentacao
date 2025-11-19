# Documentação do Projeto — Spring Boot + API

Este projeto é um backend em **Spring Boot** que implementa duas entidades relacionadas (por exemplo, Documento e Categoria), com operações CRUD completas e documentação da API com Swagger.

---

## 📚 Funcionalidades

- **Entidades:**  
  - `Categoria`  
  - `Documento` (relacionada à `Categoria`)  
- **CRUD completo** para ambas as entidades  
- **Persistência** com Spring Data JPA  
- **Documentação da API** com Swagger (OpenAPI)  
- **Banco de dados em memória** (H2) para desenvolvimento  
- Estrutura preparada para deploy (Render, por exemplo)

---

## 🧰 Tecnologias

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Springdoc OpenAPI / Swagger  
- Maven  

---

## 🚀 Como Executar o Projeto Localmente

### 1. Clone o repositório:  
   ```bash
   git clone https://github.com/LilianCMartins/documentacao.git

##Acesse a pasta do projeto:

cd documentacao


Execute o projeto com Maven:

mvn clean spring-boot:run


Acesse no navegador:

http://localhost:8080

Para acessar o Render:

https://documentacao-2.onrender.com


Para acessar a documentação do Swagger:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html#/documento-controller/findAll)

👩‍💻 Autora

Projeto desenvolvido por Lilian Martins.
