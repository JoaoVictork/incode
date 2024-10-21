package oo.heranca.desafioHeranca;

public class Dirigir {

    public static void main(String[] args) {
        Carro c1 = new Carro(290);
        Ferrari ferrari = new Ferrari(470);
        Supra supra = new Supra(320);

        c1.acelerar();
        ferrari.acelerar();
        supra.acelerar();
        c1.acelerar();
        ferrari.acelerar();
        supra.acelerar();
        c1.acelerar();
        ferrari.acelerar();
        supra.acelerar();
        c1.acelerar();
        ferrari.acelerar();
        supra.acelerar();

        System.out.println(c1);
        System.out.println( ferrari);
        System.out.println(supra);
    }
}
