#  CRUD Produtos

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de produtos através das operações fundamentais de um CRUD: **Create, Read, Update e Delete**.

O projeto foi desenvolvido com foco no aprendizado de desenvolvimento backend, organização em camadas, construção de APIs REST, utilização de DTOs e tratamento de exceções.

---
# Documentação

<table>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/2dc63e2b-a779-48a9-ac48-d8550f07e1dc" width="100%">
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/79027c49-e525-4df0-b035-08611b7acbbc" width="100%">
    </td>
  </tr>
</table>

---

##  Sobre o projeto

O **CRUD Produtos** permite realizar o gerenciamento de produtos por meio de uma API REST.

Cada produto possui:

* **ID**
* **Nome**
* **Preço**
* **Quantidade**

A aplicação disponibiliza endpoints para:

* 📋 Listar produtos
* ➕ Cadastrar produtos
* ✏️ Atualizar produtos
* 🗑️ Remover produtos

Atualmente, os dados são armazenados **em memória**, utilizando uma lista durante a execução da aplicação.

---

##  Tecnologias utilizadas

*  **Java**
*  **Spring Boot**
*  **Maven**
*  **Lombok**
*  **SpringDoc OpenAPI**
*  **REST API**
*  **JSON**

---

##  Arquitetura

O projeto utiliza uma organização baseada em responsabilidades, separando as principais partes da aplicação:

```text
src/
└── main/
    ├── java/
    │   └── br/com/vini/spring_boot_essentials/
    │       ├── controller/
    │       ├── database/
    │       │   └── model/
    │       ├── dto/
    │       ├── exception/
    │       ├── handler/
    │       ├── service/
    │       └── SpringBootEssentialsApplication.java
    │
    └── resources/
        └── application.yaml
```

### Responsabilidade das camadas

**Controller**

Responsável por receber as requisições HTTP e disponibilizar os endpoints da API.

**Service**

Responsável pela lógica de negócio e pelas operações realizadas sobre os produtos.

**DTO**

Utilizado para transportar os dados recebidos nas requisições de criação e atualização.

**Model**

Representa a estrutura dos produtos utilizados pela aplicação.

**Exception**

Contém as exceções personalizadas utilizadas pelo sistema.

**Handler**

Responsável pelo tratamento global das exceções e pela padronização das respostas de erro.

---

##  Endpoints

A API utiliza o prefixo:

```text
/v1/produtos
```

### Listar produtos

```http
GET /v1/produtos
```

Retorna todos os produtos cadastrados.

**Status:** `200 OK`

---

### Cadastrar produto

```http
POST /v1/produtos
```

Exemplo de requisição:

```json
{
  "nome": "Teclado Mecânico",
  "preco": 299.90,
  "quantidade": 10
}
```

**Status:** `201 Created`

---

### Atualizar produto

```http
PUT /v1/produtos/{id}
```

Exemplo:

```http
PUT /v1/produtos/1
```

Body:

```json
{
  "nome": "Teclado Mecânico RGB",
  "preco": 349.90,
  "quantidade": 15
}
```

**Status:** `200 OK`

---

### Remover produto

```http
DELETE /v1/produtos/{id}
```

Exemplo:

```http
DELETE /v1/produtos/1
```

**Status:** `204 No Content`

---

## Tratamento de exceções

O projeto possui um **Global Exception Handler** utilizando `@RestControllerAdvice`.

Entre os tratamentos implementados está o erro de produto não encontrado, retornando:

```json
{
  "message": "Produto não encontrado",
  "status": 404
}
```

Também existe um tratamento geral para exceções inesperadas, retornando `500 Internal Server Error`.

---

## Como executar

### Pré-requisitos

Antes de executar o projeto, tenha instalado:

* Java JDK
* Maven
* IntelliJ IDEA ou outra IDE compatível

### 1. Clone o repositório

```bash
git clone https://github.com/viniciusfonseca19/crud-produtos.git
```

### 2. Entre na pasta

```bash
cd crud-produtos
```

### 3. Execute o projeto

Com Maven:

```bash
mvn spring-boot:run
```

Ou execute a classe:

```text
SpringBootEssentialsApplication.java
```

A aplicação será iniciada na porta padrão:

```text
http://localhost:8080
```

---


##  Objetivo

Este projeto foi desenvolvido como parte dos estudos de **Java e Spring Boot**, com o objetivo de praticar conceitos fundamentais de desenvolvimento backend, incluindo:

* APIs REST
* Spring Boot
* Separação de responsabilidades
* Controllers
* Services
* DTOs
* Tratamento de exceções
* HTTP Status Codes
* JSON
* Maven
* Lombok

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Fonseca**.

Estudante de Técnico em Informática e desenvolvedor focado em **Java, Spring Boot e desenvolvimento backend**.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório!
