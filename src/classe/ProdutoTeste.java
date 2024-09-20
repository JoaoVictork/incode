package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto p1 = new Produto("ps5", 5400.99);
        var p2 = new Produto();
        p2.nome = "mesa";
        p2.preco = 250.00;

        System.out.printf("O preço base do produto %s é: %.2f.\n", p1.nome,p1.preco);
        System.out.printf("O preço base do produto %s é: %.2f.\n", p2.nome,p2.preco);

        System.out.println("pra alterar");
        scan.close();
    }
}
