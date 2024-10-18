package oo.heranca.desafioHeranca;

public class Dirigir {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Supra supra = new Supra();

        System.out.print("Velocidade do Supra: " + supra.velocidadeAtual());
        System.out.print("Velocidade da Ferrari: "+ ferrari.velocidadeAtual());
    }
}
