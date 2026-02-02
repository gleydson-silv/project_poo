package model;


public class Caminhao extends Veiculo{
    public Caminhao(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria, TipoVeiculo.CAMINHAO);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return getValorDiaria() * dias;
    }

}
