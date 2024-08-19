package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        //(°F - 32) * 5/9 = °C
        //"- 32" = ajuste
        // "5/9" = fator
        Scanner scan = new Scanner(System.in);
        final int ajuste = 32;
        final double fator = 5/9.0;
        System.out.println("Digite uma temperatura em Farenheit para ser convertida para Celsius");
        double farenheit = scan.nextDouble();
        double conversao = (farenheit - ajuste) * fator;
        System.out.printf("a temperatura em celsius é: %.1f °C",conversao);
    }
}
