package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma?");
        int qtdAlunos = scan.nextInt();
        System.out.println("Quantas notas tem cada um?");
        int qtdNotas = scan.nextInt();
        double[][] notasAlunos = new double[qtdAlunos][qtdNotas];
        double total = 0;
        for (int a = 0; a < notasAlunos.length; a++){
            for (int n = 0; n < notasAlunos[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", a+1,n+1);
                notasAlunos[a][n] = scan.nextDouble();
                total += notasAlunos[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.printf("A média da turma é: %.2f",media);
        scan.close();
    }
}
