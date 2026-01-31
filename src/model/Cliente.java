package model;

import java.util.ArrayList;

public class Cliente {
    public String nome;
    public String cpf;
    public ArrayList<Veiculo> veiculosAlugados = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Veiculo> getVeiculosAlugados() {
        return veiculosAlugados;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }

    public void alugarVeiculo(Veiculo v, int dias) {

        if(!v.isDisponivel()) {
            System.out.println("Veiculo indisponivel! ");
            return;
        }

        double valor = v.calcularValorAluguel(dias);
        v.alugar();
        veiculosAlugados.add(v);

        System.out.println("Aluguel realizado! ");
        System.out.println("Valor total: R$ " + valor);
    }

    public void devolverVeiculo(Veiculo v ) {
        if(veiculosAlugados.remove(v)) {
            v.devolver();
            System.out.println("Veiculo devolvido");
        }else {
            System.out.println("Este veiculo nao esta com o cliente. ");
        }
    }







}
