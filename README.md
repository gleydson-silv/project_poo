🚗 Sistema de Locadora de Veículos — Java (POO)
📌 Descrição do Projeto

Este projeto consiste em um sistema de locadora de veículos desenvolvido em Java, com foco na aplicação prática dos princípios da Programação Orientada a Objetos (POO).

O sistema funciona via menu interativo no terminal, permitindo o cadastro de clientes e veículos, além do controle de aluguel e devolução.
Atualmente, os dados são armazenados em memória, utilizando coleções (ArrayList), com estrutura preparada para futura integração com banco de dados.

🎯 Objetivos do Projeto

Consolidar os conceitos fundamentais de POO em Java

Aplicar boas práticas de organização e responsabilidade das classes

Simular um sistema real de locadora

Servir como base para evolução futura (persistência em banco, API, etc.)

🧠 Conceitos de Programação Utilizados

✅ Encapsulamento

✅ Herança

✅ Polimorfismo

✅ Classes abstratas

✅ Interfaces

✅ Sobrescrita de métodos (@Override)

✅ Separação por camadas (model, service, main)

✅ Uso de coleções (ArrayList)

✅ Menu em loop (do-while + switch)

🏗️ Estrutura do Projeto
src/
├── main/
│   └── Main.java
│
├── model/
│   ├── Veiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   ├── Caminhao.java
│   ├── Cliente.java
│   ├── Manutencao.java
│
├── service/
│   └── Locadora.java

📂 Descrição das Camadas

model

Contém as entidades do sistema

Representa o domínio da aplicação (Cliente, Veículo, etc.)

service

Contém a lógica de negócio

Gerencia clientes, veículos e regras de aluguel

main

Responsável pela interação com o usuário

Contém o menu principal do sistema

⚙️ Funcionalidades Implementadas

📌 Cadastro de veículos (Carro, Moto e Caminhão)

📌 Cadastro de clientes

📌 Listagem de veículos disponíveis

📌 Aluguel de veículo por cliente

📌 Devolução de veículo

📌 Busca de cliente por CPF

📌 Busca de veículo por placa

🖥️ Execução do Projeto
🔹 Pré-requisitos

Java JDK 17 ou superior

IntelliJ IDEA (ou outra IDE Java)

🔹 Como executar

Clone o repositório:

git clone https://github.com/seu-usuario/locadora-java-poo.git


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
