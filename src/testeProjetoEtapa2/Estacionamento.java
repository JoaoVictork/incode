package testeProjetoEtapa2;

import java.util.ArrayList;

public class Estacionamento {
    private int vagas;
    private ArrayList<Ticket> tickets;
    private double saldo;

    public Estacionamento(int vagas){
        this.vagas = vagas;
        this.saldo = 0;
        this.tickets = new ArrayList<>();
    }

    public Ticket emitirTicket(){
        if(tickets.size() < vagas){
            Ticket novoTicket =  new Ticket();
            tickets.add(novoTicket);
            return novoTicket;
        }
        else{
            System.out.println("Não há vagas disponíveis.");
            return null;
        }
    }
}
