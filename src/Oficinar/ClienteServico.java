package Oficinar;

import java.util.ArrayList;
import java.util.List;

public class ClienteServico {

    private int proximoId = 1;

    private List<Cliente> clientes = new ArrayList<>();


    public void cadastrarCliente(String nome, String telefone){
        Cliente cliente = new Cliente(proximoId, nome, telefone);
        proximoId++;
        clientes.add(cliente);

    }
    public  List<Cliente> listarClientes(){
        return clientes;
    }
    public Cliente buscarCliente(int id){

        for (int i = 0; i < clientes.size(); i++){

            Cliente cliente = clientes.get(i);

            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    public void removerCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {

            Cliente cliente = clientes.get(i);

            if (cliente.getId() == id) {
                clientes.remove(i);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
}
