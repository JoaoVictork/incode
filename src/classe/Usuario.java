package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
        boolean nomeigual = outro.nome.equals(this.nome);
        boolean emailigual = outro.email.equals(this.email);
        return nomeigual && emailigual;
        }
        else{
            return false;
        }
    }
}
