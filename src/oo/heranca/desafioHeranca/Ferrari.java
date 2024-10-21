package oo.heranca.desafioHeranca;

public class Ferrari extends Carro {
    int delta = 15;

    Ferrari(int velocidadeMaxima) {
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
