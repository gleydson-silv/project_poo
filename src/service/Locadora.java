package service;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import model.Cliente;
import model.Veiculo;

public class Locadora {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private VeiculoDAO veiculoDAO = new VeiculoDAO();

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    public Cliente buscarClienteCpf(String cpf) {
        return clienteDAO.buscarPorCpf(cpf);
    }

    public void cadastrarVeiculo(Veiculo v) {
        if (v.getTipo() == null) {
            throw new IllegalArgumentException("Tipo do veículo é obrigatório");
        }
        veiculoDAO.salvar(v);
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return veiculoDAO.buscarPorPlaca(placa);
    }

    public void listarClientes() {
        for (Cliente c : clienteDAO.listarTodos()) {
            System.out.println(c.getNome() + " - " + c.getCpf());
        }
    }

    public void listarVeiculosDisponiveis() {
        for (Veiculo v : veiculoDAO.listarDisponiveis()) {
            System.out.println(v);
        }
    }
}
