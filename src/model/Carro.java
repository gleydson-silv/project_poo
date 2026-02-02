package model;

public class Carro extends Veiculo implements Manutencao {
    public Carro(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria, TipoVeiculo.CARRO);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return getValorDiaria() * dias;
    }


    @Override
    public void realizarManutencao() {
        System.out.println("Manutencao realizada com sucesso");
    }

    @Override
    public void verificarManutencao() {
        System.out.println("A manutenção foi verificada com sucesso! ");
    }

}
