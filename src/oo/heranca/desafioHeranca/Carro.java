package oo.heranca.desafioHeranca;

public class Carro {
    private double velocidade = 0;

    public double velocidadeAtual(){
        return velocidade;
    }

    public boolean acelerar(){
        if (velocidade >= 0){
            velocidade += 5;
        }
        return true;
    }

    public boolean freiar(){
        if (velocidade >= 0){
            velocidade -= 5;
        }
        return true;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
