# Projeto CRUD Simples com Spring Boot

API RESTful simples para um sistema de gerenciamento de dados, desenvolvido para a Prática 03 - CRUD - SQL. A aplicação permite realizar as quatro operações básicas (Create, Read, Update, Delete) em uma entidade `Produto`.

---

### 🛠️ Tecnologias Utilizadas

* **Java 17**: Versão da linguagem de programação.
* **Spring Boot**: Framework principal para a criação da aplicação.
* **Spring Data JPA**: Para a persistência de dados e comunicação com o banco.
* **Maven**: Gerenciador de dependências do projeto.
* **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
* **Lombok**: Para simplificar o código (getters, setters, etc.).

---

### 🚀 Como Executar o Projeto

1.  **Pré-requisitos:**
    * Java 17 ou superior.
    * Maven 3.6 ou superior.

2.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU_USUARIO/projeto-crud-sql.git](https://github.com/SEU_USUARIO/projeto-crud-sql.git)
    ```

3.  **Navegue até a pasta do projeto e execute:**
    * Você pode abrir o projeto em sua IDE (como VSCode ou IntelliJ) e executar a classe principal `MeuCrudApplication`.
    * Ou, via terminal, execute o comando Maven:
    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

---

### 📋 Endpoints da API

A API expõe os seguintes endpoints para a manipulação de produtos:

| Método HTTP | URL                 | Função                                   | Exemplo de Corpo (Body)                           |
| :---------- | :------------------ | :--------------------------------------- | :------------------------------------------------ |
| `POST`      | `/produtos`         | Cria um novo produto.                    | `{ "nome": "Novo Produto", "quantidade": 10 }`    |
| `GET`       | `/produtos`         | Lista todos os produtos cadastrados.     | N/A                                               |
| `GET`       | `/produtos/{id}`    | Busca um produto específico pelo seu ID. | N/A                                               |
| `PUT`       | `/produtos/{id}`    | Atualiza um produto existente.           | `{ "nome": "Produto Atualizado", "quantidade": 5 }` |
| `DELETE`    | `/produtos/{id}`    | Deleta um produto pelo seu ID.           | N/A                                               |
