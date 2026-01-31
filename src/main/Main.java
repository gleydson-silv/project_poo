package main;

import java.util.Scanner;
import service.Locadora;
import model.*;

public class Main {

    // ================= MÉTODOS AUXILIARES =================

    private static void cadastrar_Veiculo(Scanner sc, Locadora locadora) {

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

        Veiculo v = null;

        switch (tipo) {
            case 1 -> v = new Carro(placa, modelo, ano, diaria);
            case 2 -> v = new Moto(placa, modelo, ano, diaria);
            case 3 -> v = new Caminhao(placa, modelo, ano, diaria);
            default -> System.out.println("Tipo inválido!");
        }

        if (v != null) {
            locadora.cadastrarVeiculo(v);
            System.out.println("Veículo cadastrado com sucesso!");
        }
    }

    private static void alugarVeiculo(Scanner sc, Locadora locadora) {

        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        Veiculo veiculo = null;

        for (Veiculo v : locadora.getFrota()) {
            if (v.getPlaca().equals(placa)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo == null) {
            System.out.println("Veículo não encontrado!");
            return;
        }

        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = null;

        for (Cliente c : locadora.getClientes()) {
            if (c.getCpf().equals(cpf)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();
        sc.nextLine();

        cliente.alugarVeiculo(veiculo, dias);
    }

    private static void devolverVeiculo(Scanner sc, Locadora locadora) {

        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = null;

        for (Cliente c : locadora.getClientes()) {
            if (c.getCpf().equals(cpf)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        Veiculo veiculo = null;

        for (Veiculo v : locadora.getFrota()) {
            if (v.getPlaca().equals(placa)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo == null) {
            System.out.println("Veículo não encontrado!");
            return;
        }

        cliente.devolverVeiculo(veiculo);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();

        int opcao;

        do {
            System.out.println("\n===== MENU LOCADORA =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Listar veículos disponíveis");
            System.out.println("4 - Alugar veículo");
            System.out.println("5 - Devolver veículo");
            System.out.println("6 - Buscar cliente por CPF");
            System.out.println("7 - Buscar veículo por placa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrar_Veiculo(sc, locadora);
                case 2 -> locadora.cadastrarCliente(null);
                case 3 -> locadora.listarVeiculosDisponiveis();
                case 4 -> alugarVeiculo(sc, locadora);
                case 5 -> devolverVeiculo(sc, locadora);
                case 6 -> locadora.buscarClienteCpf();
                case 7 -> locadora.buscarPorPlaca();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
