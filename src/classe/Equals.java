package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "João Victor";
        u1.email = "joao.victor@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "João Victor";
        u2.email = "joao.victor@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
