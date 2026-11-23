package Oficinar;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ClienteServico clienteServico = new ClienteServico();
        MotoServico motoServico = new MotoServico();
        System.out.print("Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = sc.nextLine();
        System.out.println("===================================");

        clienteServico.cadastrarCliente(nomeCliente, telefoneCliente);
        System.out.print("Cliente: ");
        String nomeCliente2 = sc.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente2 = sc.nextLine();

        clienteServico.cadastrarCliente(nomeCliente2, telefoneCliente2);
        System.out.println("===================================");
        System.out.print("Cliente: ");
        String nomeCliente3 = sc.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente3 = sc.nextLine();
        clienteServico.cadastrarCliente(nomeCliente3, telefoneCliente3);

        System.out.println("===================================");
        clienteServico.buscarCliente(2);
        System.out.println(clienteServico.listarClientes());


        System.out.println("===================================");
        System.out.print("Modelo da Moto: ");
        String modelo = sc.nextLine();
        System.out.print("Marca da Moto: ");
        String marca = sc.nextLine();
        System.out.print("Placa da moto; ");
        String placa = sc.nextLine();
        System.out.print("Ano da moto: ");
        int ano = sc.nextInt();
        sc.nextLine();
        motoServico.cadastraMoto(modelo, marca, placa, ano);
        System.out.println(motoServico.listaMotos());
    }
}
