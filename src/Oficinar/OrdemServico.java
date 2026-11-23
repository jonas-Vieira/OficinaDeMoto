package Oficinar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemServico {
    private Date data;
    private StatusOrdem status;
    private Cliente cliente;
    private Moto moto;

    private List<Servico> servicos = new ArrayList<>();


    public OrdemServico(Date data, StatusOrdem status, Cliente cliente, Moto moto) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;
        this.moto = moto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusOrdem getStatus() {
        return status;
    }

    public void setStatus(StatusOrdem status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public  void adicionarServico(Servico servico){
        servicos.add(servico);
    }
    public double calcularTotal(){

        double total = 0;
        for(Servico servico: servicos){
            total += servico.getPreco();
        }
        return total;
    }

    public void exibirOrdemServico(){
        System.out.println("DATA DA ORDEM: " + getData());
        System.out.println("STATUS: " + getStatus());
        System.out.println("CLIENTE: " + getCliente().getNome());
        System.out.println("MODELO: " + getMoto().getModelo() + "PLACA DA MOTO: " + getMoto().getPlaca());
        System.out.println("SERVIÇO: " + getServicos());
        System.out.println("VALOR TOTAL: " + calcularTotal());

    }

}
