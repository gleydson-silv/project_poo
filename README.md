# 🚗 Sistema de Locadora de Veículos — Java + PostgreSQL (POO)

## 📌 Descrição do Projeto

Este projeto consiste em um **sistema de locadora de veículos desenvolvido em Java**, com foco na aplicação prática dos **conceitos de Programação Orientada a Objetos (POO)** e **persistência de dados em banco relacional**.

O sistema funciona por meio de um **menu interativo no terminal**, permitindo o cadastro de clientes e veículos, além do controle de aluguel e devolução.  
Atualmente, os dados são **persistidos em um banco de dados PostgreSQL**, utilizando **JDBC** e o **padrão DAO**.

---

## 🎯 Objetivos do Projeto

- Consolidar os conceitos fundamentais de Programação Orientada a Objetos em Java
- Aplicar boas práticas de encapsulamento e responsabilidade das classes
- Implementar persistência de dados com PostgreSQL
- Utilizar o padrão DAO para separação da camada de acesso a dados
- Simular um sistema real de locadora de veículos
- Servir como base para evoluções futuras (MVC, API REST, Spring Boot)

---

## 🧠 Conceitos de Programação Utilizados

- Encapsulamento
- Herança
- Polimorfismo
- Classes abstratas
- Enumeração (`enum`)
- Sobrescrita de métodos (`@Override`)
- Separação de responsabilidades (Model / Service / DAO)
- JDBC
- Padrão DAO
- Banco de dados relacional (PostgreSQL)
- Menu interativo com loop (`do-while` e `switch-case`)

---

## 🏗️ Estrutura do Projeto

```text
src/
└── main/
    └── java/
        ├── main/
        │   └── Main.java
        │
        ├── model/
        │   ├── Veiculo.java
        │   ├── Carro.java
        │   ├── Moto.java
        │   ├── Caminhao.java
        │   ├── Cliente.java
        │   └── TipoVeiculo.java
        │
        ├── dao/
        │   ├── ClienteDAO.java
        │   └── VeiculoDAO.java
        │
        ├── service/
        │   └── Locadora.java
        │
        └── database/
            └── Conexao.java
📂 Organização das Camadas
🔹 model
Camada de domínio da aplicação.
Responsável por representar as entidades do sistema (Cliente, Veiculo, etc.) e suas regras básicas.

🔹 dao
Camada de acesso a dados.
Responsável por realizar operações no banco de dados utilizando JDBC (INSERT, SELECT, etc.).

🔹 service
Camada de regras de negócio.
Intermedia a comunicação entre o menu e os DAOs, garantindo validações e consistência.

🔹 database
Camada responsável pela configuração e gerenciamento da conexão com o banco de dados PostgreSQL.

🔹 main
Camada responsável pela interação com o usuário via terminal, contendo o menu principal.

🗄️ Banco de Dados
🔹 Banco utilizado
PostgreSQL

🔹 Tabelas
📌 Tabela cliente
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL
);
📌 Enum tipo_veiculo
CREATE TYPE tipo_veiculo AS ENUM ('CARRO', 'MOTO', 'CAMINHAO');
📌 Tabela veiculo
CREATE TABLE veiculo (
    id SERIAL PRIMARY KEY,
    placa VARCHAR(10) UNIQUE NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    ano INT NOT NULL,
    valor_diaria NUMERIC(10,2) NOT NULL,
    disponivel BOOLEAN NOT NULL,
    tipo tipo_veiculo NOT NULL
);
⚙️ Funcionalidades Implementadas
Cadastro de clientes com persistência no banco

Cadastro de veículos (Carro, Moto e Caminhão)

Armazenamento dos veículos no PostgreSQL

Uso de enum para garantir integridade do tipo do veículo

Listagem de veículos disponíveis

Busca de cliente por CPF

Busca de veículo por placa

Validações de dados antes da persistência

Conexão segura com JDBC

🖥️ Execução do Projeto
🔹 Pré-requisitos
Java JDK 17 ou superior

PostgreSQL instalado e em execução

IntelliJ IDEA (ou outra IDE Java)

Driver JDBC do PostgreSQL

🔹 Como executar
Clone o repositório:

git clone https://github.com/gleydson-silv/project_poo.git
Crie o banco e as tabelas no PostgreSQL

Configure a conexão em:

database/Conexao.java
Abra o projeto no IntelliJ

Execute:

Main.java
Interaja com o menu pelo terminal

📌 Estado Atual do Projeto
✔ Persistência com PostgreSQL
✔ JDBC configurado
✔ Padrão DAO implementado
✔ Estrutura organizada por camadas
✔ Projeto totalmente funcional via terminal

🚀 Próximas Evoluções Planejadas
🔲 Registro de histórico de aluguéis
🔲 Relacionamento cliente × veículo
🔲 Arquitetura MVC
🔲 API REST
🔲 Migração para Spring Boot
🔲 Interface gráfica ou frontend web

👨‍💻 Autor
Gleydson Luidy Batista da Silva
Projeto desenvolvido para estudo e prática de Programação Orientada a Objetos em Java, JDBC e banco de dados relacional.

