package model;

public class Moto extends Veiculo{
    public Moto(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        double preco_fixo = 139.99;
        double preco_aluguel = dias * preco_fixo;
        return preco_aluguel;
    }


}
