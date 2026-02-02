package model;

import java.util.Scanner;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;
    private boolean disponivel;
    private TipoVeiculo tipo;


    protected Veiculo(String placa, String modelo, int ano, double valorDiaria,TipoVeiculo tipo) {
        if(tipo == null) {
            throw new IllegalArgumentException("Tipo do veículo é obrigatório");
        }

        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {return modelo;}
    public int getAno() {return ano;}
    public double getValorDiaria() {return valorDiaria;}

    @Override
    public String toString() {
        return "Modelo: " + modelo + " | Placa: " + placa + "| Tipo: " + tipo;
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

    public abstract double calcularValorAluguel(int dias);

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

    public TipoVeiculo getTipo() {
        return tipo;
    }


}
