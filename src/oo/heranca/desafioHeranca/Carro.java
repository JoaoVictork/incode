package oo.heranca.desafioHeranca;

public class Carro {
    private double velocidade = 0;

    public double velocidadeAtual(){
        return velocidade;
    }

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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
