package fundamentos;

import java.util.Date;
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        String inicio = "Boa noite!";
        System.out.println(inicio);

        Scanner scan = new Scanner(System.in);
        System.out.println("Você deseja ver a data e hora de hoje? ");
        String confirmacao = scan.nextLine();
        Date data = new Date();
        System.out.println(data);
    }
}
