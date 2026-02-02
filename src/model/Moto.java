package model;

public class Moto extends Veiculo{
    public Moto(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria,TipoVeiculo.MOTO);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return getValorDiaria() * dias;
    }

}
