package oo.encapsulamento;

public class Pessoa {

    private String nome = "João";
    private String sobrenome = "Nascimento";
    private int idade;

    Pessoa(int idade){
        if (idade >= 0 && idade <= 110){
            this.idade = idade;
        }else{
            System.out.println("idade inválida");
        }
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        return "O usuário " + getNomeCompleto() + " tem "+ getIdade();
    }
}
