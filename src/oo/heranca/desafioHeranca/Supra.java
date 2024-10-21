package oo.heranca.desafioHeranca;

public class Supra extends Carro{

    @Override
    public void acelerar() {
        if (velocidade >= 0){
            velocidade += 10;
        }
    }
}
