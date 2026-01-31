package model;

import java.util.Scanner;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, int ano, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Nome: " + modelo + " | CPF: " + placa;
    }

    public void alugar() {
        if (!disponivel) {
            System.out.println("Veículo já está alugado!");
            return;
        }
        disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public double calcularValorAluguel(int dias) {
        return valorDiaria * dias;
    }

    public void exibir_dados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor diaria: " + valorDiaria);
        System.out.println("Disponivel: " + disponivel);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

}
