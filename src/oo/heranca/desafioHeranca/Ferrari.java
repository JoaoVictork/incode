package oo.heranca.desafioHeranca;

public class Ferrari extends Carro {
    @Override
    public void acelerar() {
        if(velocidade >= 0 ){
            velocidade += 15;
        }
    }
}
