package Oficinar;

public class Cliente {
    private final int id;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados(){
        System.out.println("Id cliente: " + id);
        System.out.println("Cliente: " + nome);
        System.out.println("Telefone: " + telefone);
    }
    public void alterarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public String toString() {
        return
                "Cliente \n" +
                "id = " + id +
                " nome = " + nome +
                " telefone = " + telefone;
    }
}