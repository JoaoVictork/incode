package projetoFinalEtapaUm;

import java.util.ArrayList;
import java.util.Scanner;
public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Qual função você deseja executar:");
            System.out.println("1. Adicionar tarefa...");
            System.out.println("2. Marcar tarefa como concluída...");
            System.out.println("3. Listar todas as tarefas atuais...");
            System.out.println("4. Sair...");
            int funcao = scan.nextInt();
            scan.nextLine();

            switch (funcao) {
                case 1:
                    System.out.print("Adicionar a tarefa: ");
                    String adicionarTarefa = scan.nextLine();
                    tarefas.add(adicionarTarefa);
                    break;
                case 2:
                    System.out.println("qual o numero da tarefa que você concluiu?");
                    int indiceTarefa = scan.nextInt();
                    scan.nextLine();
                    if(indiceTarefa > 0 && indiceTarefa < tarefas.size()){
                        tarefas.remove(indiceTarefa - 1);
                        System.out.println("tarefa concluida");
                    }else {
                        System.out.println("tarefa inexistente");
                    }
                    break;
                case 3:
                    System.out.println("A lista contém: ");
                    for (int i = 0; i < tarefas.size(); i++){
                        System.out.println((i + 1)+". "+tarefas.get(i));
                    }
                    break;
                case 4:
                    System.exit(0);
                    scan.close();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}
