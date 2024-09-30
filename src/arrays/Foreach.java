package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = new double[]{ 10, 5, 7, 7};
        double total = 0;
        System.out.println("as notas do aluno são:");
        for (double nota: notas){
            System.out.println(nota);
            total += nota;
        }
        System.out.printf("a somatória das notas do aluno é: %.2f\n", total);
        double media = total / notas.length;
        System.out.printf("a média das notas do aluno é: %.2f\n",media);
    }
}
