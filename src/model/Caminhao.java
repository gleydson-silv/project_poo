package model;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Caminhao extends Veiculo{
    public Caminhao(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        double preco_fixo = 299.99;
        double preco_aluguel = dias * preco_fixo;
        return preco_aluguel;
    }

}
