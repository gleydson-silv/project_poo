# 🚗 Sistema de Locadora de Veículos — Java (POO)

## 📌 Descrição do Projeto

Este projeto consiste em um **sistema de locadora de veículos desenvolvido em Java**, com foco na aplicação prática dos **conceitos de Programação Orientada a Objetos (POO)**.

O sistema funciona por meio de um **menu interativo no terminal**, permitindo o cadastro de clientes e veículos, além do controle de aluguel e devolução.  
Atualmente, os dados são armazenados **em memória**, utilizando coleções (`ArrayList`), sem integração com banco de dados.

---

## 🎯 Objetivos do Projeto

- Consolidar os conceitos fundamentais de Programação Orientada a Objetos em Java
- Aplicar boas práticas de organização e responsabilidade das classes
- Simular um sistema real de locadora de veículos
- Servir como base para futuras evoluções (persistência, banco de dados, API, etc.)

---

## 🧠 Conceitos de Programação Utilizados

- Encapsulamento
- Herança
- Polimorfismo
- Classes abstratas
- Interfaces
- Sobrescrita de métodos (`@Override`)
- Separação de responsabilidades
- Coleções (`ArrayList`)
- Menu interativo com loop (`do-while` e `switch-case`)

---

## 🏗️ Estrutura do Projeto

- src/
- ├── main/
- │   └── Main.java
- │
- ├── model/
- │   ├── Veiculo.java
- │   ├── Carro.java
- │   ├── Moto.java
- │   ├── Caminhao.java
- │   ├── Cliente.java
- │   ├── Manutencao.java
- │
- ├── service/
- │   └── Locadora.java

---

## 📂 Organização das Camadas

### 🔹 model
Camada responsável por representar as entidades do sistema e o domínio da aplicação, como clientes e veículos.

### 🔹 service
Camada responsável pela lógica de negócio e regras do sistema, como cadastro, aluguel e devolução de veículos.

### 🔹 main
Camada responsável pela interação com o usuário, contendo o menu principal e o fluxo da aplicação.

---

## ⚙️ Funcionalidades Implementadas

- Cadastro de veículos (Carro, Moto e Caminhão)
- Cadastro de clientes
- Listagem de veículos disponíveis
- Aluguel de veículos
- Devolução de veículos
- Busca de cliente por CPF
- Busca de veículo por placa

---

🖥️ Execução do Projeto
🔹 Pré-requisitos

Java JDK 17 ou superior

IntelliJ IDEA (ou outra IDE Java)

🔹 Como executar

Clone o repositório:
https://github.com/gleydson-silv/project_poo.git


Abra o projeto no IntelliJ

Execute a classe:

Main.java


Interaja com o menu pelo terminal

📌 Estado Atual do Projeto

🔹 Armazenamento de dados em memória

🔹 Não utiliza banco de dados no momento

🔹 Estrutura preparada para futura persistência (DAO / JDBC)

🚀 Próximas Evoluções Planejadas

🔲 Integração com banco de dados PostgreSQL

🔲 Implementação do padrão DAO

🔲 Persistência de dados

🔲 Registro de histórico de aluguéis

🔲 Refatoração para arquitetura MVC

🔲 Migração futura para Spring Boot

👨‍💻 Autor

Gleydson Luidy Batista da Silva
Projeto desenvolvido para estudo e prática de Programação Orientada a Objetos em Java.
