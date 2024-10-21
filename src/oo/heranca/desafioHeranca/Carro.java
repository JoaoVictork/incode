package oo.heranca.desafioHeranca;

public class Carro {
     double velocidade = 0;

    public void acelerar(){
        if (velocidade >= 0){
            velocidade += 5;
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
