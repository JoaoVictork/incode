package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunos = new double[3];
        notasAlunos[0] = 2.4;
        notasAlunos[1] = 5.7;
        notasAlunos[2] = 9;

        //endereço de memória
        System.out.println(notasAlunos);
        //valores armazenados
        System.out.println(Arrays.toString(notasAlunos));
        double total = 0;
        for(int i = 0; i < notasAlunos.length; i++){
            total += notasAlunos[i];
        }
        System.out.printf("o total das notas dos alunos é: %.2f\n",total);
        double media = total / notasAlunos.length;
        System.out.printf("a média das notas dos alunos é: %.2f\n",media);
    }
}
