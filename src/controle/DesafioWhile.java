package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNotas = 0;
        double somaNotas = 0;
        double nota = 0;
        while (nota != -1){
            System.out.print("Digite a sua nota: ");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10){
                 somaNotas += nota;
                 qtdNotas++;
            }
        }
        double media = somaNotas / qtdNotas;
        System.out.printf("A média da turma é: %.1f%n",media);
        System.out.printf("A quantidade de notas é: %d%n",qtdNotas);
        System.out.printf("a soma das notas é: %.1f",somaNotas);
        scan.close();
    }
}
