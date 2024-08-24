package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        //primeiro quadro

        //A1
        int a = (6 * (3 + 2));
        int a2 = 3 * 2;
        int a1 = (int) Math.pow(a,2);
        int primeiraResolucao = a1/a2;

        //B1
        int b1 = (1 - 5)*(2 - 7);
        int b2 = 2;
        int b = b1 / b2;
        int segundaResolucao = (int) Math.pow(b, 2);

        //AB
        int AB = primeiraResolucao - segundaResolucao;
        int ABResolvido = (int) Math.pow(AB,3);

        //Resolução
        int C = (int) Math.pow(10, 3);
        int resolucao = ABResolvido /C;

        System.out.println("o resultado é: "+resolucao);

        //------------------OTIMIZAÇÃO DO CÓDIGO------------------

        double numA = Math.pow(6 * (3 + 2),2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB/denB, 2);

        double superior = Math.pow(superiorA - superiorB,3);
        double inferior = Math.pow(10, 3);

        double resultado = superior/inferior;

        System.out.printf("O resultado é: %.1f",resultado);
    }
}
