package controle;

import java.util.Scanner;

public class ForDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o intervalo para decrescer: ");
        int intervalo = scan.nextInt();
        System.out.print("digite um valor a ser decrescido: ");
        for (int valorParaDecrescer = scan.nextInt(); valorParaDecrescer >= 0; valorParaDecrescer-= intervalo){
            System.out.println(valorParaDecrescer);
        }
        scan.close();
    }
}
