package fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Boa noite".charAt(6));

        String a = "Meu nome é João";
        System.out.println(a.concat(" e eu sou um estudante"));
        System.out.println(a + "!!!");
        System.out.println(a.startsWith("meu"));
        System.out.println(a.equalsIgnoreCase("meu nome é João"));
        System.out.println();

        var nome = "Victor";
        var sobrenome = "Melo";
        var idade = 17;
        var salario = 2_500.50;

        System.out.println("-----------exemplo 01 de forma de printar-----------");
        System.out.println("Nome = "+nome+" Sobrenome = "+sobrenome+" idade = "+idade+" salario = "+salario+"\n");
        System.out.println("-----------exemplo 02 de forma de printar-----------");
        System.out.println("Nome = "+nome+"\nSobrenome = "+sobrenome+"\nidade = "+idade+"\nsalario = "+salario);
        System.out.println("-----------exemplo 03 de forma de printar-----------");
        System.out.printf("O funcionário %s %s tem %d anos e ganha R$%.2f por mês", nome,sobrenome,idade,salario);
    }
}
