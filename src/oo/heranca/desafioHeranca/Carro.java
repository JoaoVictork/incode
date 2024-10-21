package oo.heranca.desafioHeranca;

public class Carro {
    final int VELOCIDADE_MAXIMA;
     int velocidade = 0;
     int delta = 5;

     Carro(int velocidadeMaxima){
         VELOCIDADE_MAXIMA = velocidadeMaxima;
     }

    public void acelerar(){
        if (velocidade + delta >= VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        }
        else {
            velocidade += delta;
        }
    }

    public void freiar(){
        if (velocidade >= 5){
            velocidade -= 5;
        }
    }

    public String toString(){
        return "A velocidade é: " + velocidade + "Km/h.";
    }
}
