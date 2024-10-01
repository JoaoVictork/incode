package teste;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Ticket {
    private int numero;
    private double valorBase;
    private boolean pago;
    private long entrada;

    public Ticket(int numero, double valorBase) {
        this.numero = numero;
        this.valorBase = valorBase;
        this.pago = false;
        this.entrada = System.currentTimeMillis(); // registro da hora de entrada
    }

    public int getNumero() {
        return numero;
    }

    public double getValorBase() {
        return valorBase;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public long getEntrada() {
        return entrada;
    }

    public String getHoraEntrada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date(entrada));
    }
}

class Estacionamento {
    private List<Ticket> tickets;
    private int vagas;
    private double saldo;

    public Estacionamento(int vagas) {
        this.tickets = new ArrayList<>();
        this.vagas = vagas;
        this.saldo = 0.0;
    }

    public Ticket emitirTicket(int numero, double valorBase) {
        if (tickets.size() < vagas) {
            Ticket ticket = new Ticket(numero, valorBase);
            tickets.add(ticket);
            return ticket;
        } else {
            return null; // estacionamento lotado
        }
    }

    public String pagarTicket(int numero, long saida) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero) {
                if (!ticket.isPago()) {
                    long tempoPermanencia = (saida - ticket.getEntrada()) / 3600000; // tempo de permanência em horas
                    double valorAPagar = ticket.getValorBase();

                    // Aumenta o valor a partir da segunda hora
                    if (tempoPermanencia > 2) {
                        valorAPagar += (tempoPermanencia - 2) * (ticket.getValorBase() * 0.20); // Aumento de 20% por hora
                    }

                    saldo += valorAPagar;
                    ticket.setPago(true);
                    return "Ticket " + numero + " pago com sucesso! Valor: R$" + String.format("%.2f", valorAPagar);
                } else {
                    return "Ticket " + numero + " já pago!";
                }
            }
        }
        return "Ticket " + numero + " não encontrado!";
    }

    public String consultarSaldo() {
        return "Saldo atual: R$" + String.format("%.2f", saldo);
    }

    public String consultarTicket(int numero) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero) {
                return "Ticket " + numero + ": " + (ticket.isPago() ? "Pago" : "Não Pago") +
                        ", Hora de Entrada: " + ticket.getHoraEntrada();
            }
        }
        return "Ticket " + numero + " não encontrado!";
    }

    public int getVagasDisponiveis() {
        return vagas - tickets.size();
    }
}

public class MaquinaDeTickets {
    private Estacionamento estacionamento;
    private Scanner scanner;

    public MaquinaDeTickets(int vagas) {
        this.estacionamento = new Estacionamento(vagas);
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("Máquina de Tickets de Estacionamento");
            System.out.println("1. Emitir Ticket");
            System.out.println("2. Pagar Ticket");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Consultar Ticket");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    emitirTicket();
                    break;
                case 2:
                    pagarTicket();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    consultarTicket();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close(); // Fechar o scanner ao sair
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void emitirTicket() {
        System.out.print("Número do ticket: ");
        int numero = scanner.nextInt();
        System.out.print("Valor do ticket: ");
        double valor = scanner.nextDouble();
        Ticket ticket = estacionamento.emitirTicket(numero, valor);
        if (ticket != null) {
            System.out.println("Ticket emitido com sucesso!");
            System.out.println("Hora de Entrada: " + ticket.getHoraEntrada());
        } else {
            System.out.println("Estacionamento lotado!");
        }
    }

    private void pagarTicket() {
        System.out.print("Número do ticket: ");
        int numero = scanner.nextInt();
        System.out.print("Informe o horário de saída (HH:mm): ");
        String horarioSaida = scanner.next();
        String[] partes = horarioSaida.split(":");
        if (partes.length != 2) {
            System.out.println("Formato de horário inválido! Use HH:mm.");
            return;
        }

        int horasSaida = Integer.parseInt(partes[0]);
        int minutosSaida = Integer.parseInt(partes[1]);

        // Convertendo horário de saída para timestamp
        long saida = System.currentTimeMillis() - (System.currentTimeMillis() % 86400000) + (horasSaida * 3600000) + (minutosSaida * 60000);

        String resultado = estacionamento.pagarTicket(numero, saida);
        System.out.println(resultado);
    }

    private void consultarSaldo() {
        String saldo = estacionamento.consultarSaldo();
        System.out.println(saldo);
    }

    private void consultarTicket() {
        System.out.print("Número do ticket: ");
        int numero = scanner.nextInt();
        String resultado = estacionamento.consultarTicket(numero);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        MaquinaDeTickets maquina = new MaquinaDeTickets(10); // Exemplo com 10 vagas
        maquina.iniciar();
    }
}
