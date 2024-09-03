package controle;

import java.util.Scanner;

public class DesafioElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia da semana referente a um numero");
        String diaSemana = scan.nextLine();
        if ("domingo".equalsIgnoreCase(diaSemana)){
            System.out.println("O dia digitado é o "+1+"° dia da semana.");
        } else if ("segunda".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+2+"° dia da semana.");
        } else if ("terca".equalsIgnoreCase(diaSemana) || "terça".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+3+"° dia da semana.");
        } else if ("quarta".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+4+"° dia da semana.");
        } else if ("quinta".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+5+"° dia da semana.");
        } else if ("sexta".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+6+"° dia da semana.");
        } else if ("sabado".equalsIgnoreCase(diaSemana) || "sábado".equalsIgnoreCase(diaSemana)) {
            System.out.println("O dia digitado é o "+7+"° dia da semana.");
        }else{
            System.out.println("Dia inválido.");
        }
        scan.close();
    }
}
