package oo.heranca.desafioHeranca;

public class Supra extends Carro{
    int delta = 10;

    Supra(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar(){
        if (velocidade + delta >= VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        }
        else {
            velocidade += delta;
        }
    }
}
