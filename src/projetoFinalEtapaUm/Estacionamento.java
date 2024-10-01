package projetoFinalEtapaUm;
import java.util.HashSet;

class Ticket {
    private int numero;
    private double valor;
    private boolean pago;
    private long entrada;

    public Ticket(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.pago = false;
        this.entrada = System.currentTimeMillis(); // registro da hora de entrada
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
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
}

public class Estacionamento {
    private HashSet<Ticket> tickets;
    private int vagas;
    private double saldo;

    public Estacionamento(int vagas) {
        this.tickets = new HashSet<>();
        this.vagas = vagas;
        this.saldo = 0.0;
    }

    public Ticket emitirTicket(int numero, double valor) {
        if (tickets.size() < vagas) {
            Ticket ticket = new Ticket(numero, valor);
            tickets.add(ticket);
            return ticket;
        } else {
            return null; // estacionamento lotado
        }
    }

    public String pagarTicket(int numero) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero) {
                if (!ticket.isPago()) {
                    long tempoPermanencia = (System.currentTimeMillis() - ticket.getEntrada()) / 60000; // tempo de permanência em minutos
                    double valorAPagar = ticket.getValor() * (1 + (tempoPermanencia / 120) * 0.20); // aumento de 20% a cada 2 horas
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
                return "Ticket " + numero + ": " + (ticket.isPago() ? "Pago" : "Não Pago");
            }
        }
        return "Ticket " + numero + " não encontrado!";
    }

    public int getVagasDisponiveis() {
        return vagas - tickets.size();
    }

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(10); // 10 vagas
        Ticket ticket1 = estacionamento.emitirTicket(1, 10.0);
        System.out.println("Ticket " + ticket1.getNumero() + ": R$" + ticket1.getValor());

        System.out.println(estacionamento.pagarTicket(1));
        System.out.println(estacionamento.consultarSaldo());
        System.out.println(estacionamento.consultarTicket(1));
        System.out.println("Vagas disponíveis: " + estacionamento.getVagasDisponiveis());
    }
}