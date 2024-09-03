package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a nota da prova mais recente que você fez: ");
        double nota = scan.nextDouble();

        if (nota >= 7.00){
            System.out.println("Parabéns, você está na média/acima da média!!");
        }
        scan.close();
    }
}
