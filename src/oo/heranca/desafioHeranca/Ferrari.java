package oo.heranca.desafioHeranca;

public class Ferrari extends Carro {
    double velocidadeFerrari = getVelocidade();
    @Override
    public void acelerar() {
        velocidadeFerrari += 15;
    }
}
