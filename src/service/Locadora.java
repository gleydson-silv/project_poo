package service;
import model.Cliente;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {

    private ArrayList<Veiculo> frota;
    private ArrayList<Cliente> clientes;

    public Locadora() {
        this.frota = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Veiculo> getFrota() {
        return frota;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void listarVeiculosDisponiveis() {
        for (Veiculo v : frota) {
            if (v.isDisponivel()) {
                v.exibir_dados();
                System.out.println("-------------------");
            }
        }
    }


    public void cadastrarCliente(Cliente cliente) {
            System.out.print("Nome: ");
            Scanner sc = new Scanner(System.in);
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            Cliente c = new Cliente(nome, cpf);

            System.out.println("Cliente cadastrado!");

            clientes.add(c);
    }

    public void listarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void buscarClienteCpf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF para realizar a busca: ");
        String cpf = sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("Cliente não encontrado.");
    }

    public void buscarPorPlaca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a plcaca para realizar a busca: ");
        String placa = sc.nextLine();

        for (Veiculo v : frota) {
            if(v.getPlaca().equals(placa)) {
                System.out.println(v);
                return;
            }
        }

        System.out.println("Placa não encontrada! ");
    }

}