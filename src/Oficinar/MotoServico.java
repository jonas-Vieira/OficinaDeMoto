package Oficinar;

import java.util.ArrayList;
import java.util.List;

public class MotoServico {
    private int proximoId = 1;

    private List<Moto> motos = new ArrayList<>();

    public void cadastraMoto(String modelo, String marca, String placa, int ano){
        Moto moto = new Moto(proximoId, modelo, marca, placa, ano);
        proximoId ++;

        motos.add(moto);
    }
    public List<Moto> listaMotos(){
        return motos;
    }
    public Moto buscarMoto(int id){
        for(int i=0;i<motos.size(); i++){

            Moto moto = motos.get(i);

            if (moto.getId() == id){
                return moto;
            }
        }
        return null;
    }

    public void removerMoto(int id) {
        for (int i=0; i<motos.size(); i++){

            Moto moto = motos.get(i);

            if (moto.getId() == id){
                motos.remove(i);
                System.out.println("Moto removidar.");
                return;
            }
            System.out.println("Moto não encontrada.");
        }
    }
}