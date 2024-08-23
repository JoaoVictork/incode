package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine().replace(",",".");
        String b = scan.nextLine().replace(",",".");
        String c = scan.nextLine().replace(",",".");
        double salario1 = Double.parseDouble(a);
        double salario2 = Double.parseDouble(b);
        double salario3 = Double.parseDouble(c);
        double media = (salario1 + salario2 + salario3)/3;
        System.out.printf("A média de salários é: %.2f",media);
        scan.close();
    }
}
