package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas notas o aluno teve?");
        int qtdNotas = scan.nextInt();
        double[] notasAluno = new double[qtdNotas];
        for (int i = 0; i < notasAluno.length; i++ ){
            System.out.println("insira a nota "+(i + 1)+".");
            double nota = scan.nextDouble();
            notasAluno[i] = nota;
        }
        System.out.println(Arrays.toString(notasAluno));
        double soma = 0;
        for (double notasSomadas: notasAluno){
            soma += notasSomadas;
        }
        System.out.printf("a soma das notas é: %.2f\n",soma);
        double media = soma / notasAluno.length;
        System.out.printf("a média do aluno é: %.2f\n",media);
        scan.close();
    }
}
