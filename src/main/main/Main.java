package main.main;

import java.util.Scanner;
import service.Locadora;
import model.*;

public class Main {

    private static void cadastrarVeiculo(Scanner sc, Locadora locadora) {

        System.out.println("Tipo de veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Valor da diária: ");
        double diaria = sc.nextDouble();
        sc.nextLine();

        Veiculo v = switch (tipo) {
            case 1 -> new Carro(placa, modelo, ano, diaria);
            case 2 -> new Moto(placa, modelo, ano, diaria);
            case 3 -> new Caminhao(placa, modelo, ano, diaria);
            default -> null;
        };

        if (v == null) {
            System.out.println("Tipo inválido!");
            return;
        }

        locadora.cadastrarVeiculo(v);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    private static void cadastrarCliente(Scanner sc, Locadora locadora) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        locadora.cadastrarCliente(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void alugarVeiculo(Scanner sc, Locadora locadora) {

        System.out.print("Placa do veículo: ");
        String placa = sc.nextLine();

        Veiculo veiculo = locadora.buscarVeiculoPorPlaca(placa);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado!");
            return;
        }

        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = locadora.buscarClienteCpf(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();
        sc.nextLine();

        cliente.alugarVeiculo(veiculo, dias);
        System.out.println("Veículo alugado com sucesso!");
    }

    private static void devolverVeiculo(Scanner sc, Locadora locadora) {

        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = locadora.buscarClienteCpf(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Placa do veículo: ");
        String placa = sc.nextLine();

        Veiculo veiculo = locadora.buscarVeiculoPorPlaca(placa);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado!");
            return;
        }

        cliente.devolverVeiculo(veiculo);
        System.out.println("Veículo devolvido com sucesso!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();

        int opcao;

        do {
            System.out.println("\n===== MENU LOCADORA =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Alugar veículo");
            System.out.println("4 - Devolver veículo");
            System.out.println("5 - Buscar cliente por CPF");
            System.out.println("6 - Buscar veículo por placa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarVeiculo(sc, locadora);
                case 2 -> cadastrarCliente(sc, locadora);
                case 3 -> alugarVeiculo(sc, locadora);
                case 4 -> devolverVeiculo(sc, locadora);
                case 5 -> {
                    System.out.print("CPF: ");
                    Cliente c = locadora.buscarClienteCpf(sc.nextLine());
                    System.out.println(c != null ? c : "Cliente não encontrado");
                }
                case 6 -> {
                    System.out.print("Placa: ");
                    Veiculo v = locadora.buscarVeiculoPorPlaca(sc.nextLine());
                    System.out.println(v != null ? v : "Veículo não encontrado");
                }
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
