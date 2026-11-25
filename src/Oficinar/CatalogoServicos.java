package Oficinar;

import java.util.ArrayList;
import java.util.List;

public class CatalogoServicos {
    private List<Servico> servicos = new ArrayList<>();

    public void addNoCatalogo(Servico addServico){
        servicos.add(addServico);
    }

    public void listaCatalogo(){
        for (Servico servico: servicos){
            servico.servico();
        }
    }

    public Servico buscarServico(String descricao) {
        for (int i = 0; i < servicos.size(); i++) {

            Servico servico = servicos.get(i);
            if (servico.getDescricao().equalsIgnoreCase(descricao)) {
                return servico;

            }
        }
        return null;
    }
    public  void removerServico(String descricao){
        for (int i=0; i< servicos.size(); i++){

            Servico servico = servicos.get(i);

            if (servico.getDescricao().equalsIgnoreCase(descricao)){
                servicos.remove(i);
                System.out.println("SERVIÇO REMOVIDO COM SUCESSO!");
                return;
            }else {
                System.out.println("SERVICO NÃO ENCONTRADO.");
            }
        }
    }
}
