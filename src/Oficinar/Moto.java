package Oficinar;

import java.util.Date;

public class Moto {
    private final int id;
    private String modelo;
    private String marca;
    private String placa;
    private int ano;

    public Moto(int id, String modelo, String marca, String placa, int ano) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
    public void alterarPlaca(String novaPlaca){
        this.placa = novaPlaca;
        System.out.println("Placa alterada com sucesso!");

    }

    public String toString() {
        return "Moto: \n" +
                " id: " + id + "\n"
                +" modelo: " + modelo + "\n"
                +" marca: " + marca + "\n"
                +" placa: " + placa + "\n"
                +" ano:" + ano
                ;
    }
}
