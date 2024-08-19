package fundamentos;

import java.util.Scanner;

public class TestePontosFlutuantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroParaDividir = scan.nextInt();
        float numeroDivididoFloat = numeroParaDividir/9.0f;
        System.out.printf("com 7 casas decimais é possível? %.7f... Sim, é possível%n", numeroDivididoFloat);
        System.out.printf("com 8 casas decimais é possível? %.8f... Sim, é possível%n", numeroDivididoFloat);
        double numeroDivididoDouble = numeroParaDividir/9.0;
        System.out.printf("com 15 casas decimais é possível? %.15f... Sim, é possível%n", numeroDivididoDouble);
        System.out.printf("com 16 casas decimais é possível? %.16f... Sim, é possível%n", numeroDivididoDouble);
    }
}
