package model;

public class Carro extends Veiculo implements Manutencao {
    public Carro(String placa, String modelo, int ano, double valorDiaria) {
        super(placa,modelo,ano, valorDiaria);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        double preco_fixo = 199.99;
        double preco_aluguel = dias * preco_fixo;
        return preco_aluguel;
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
