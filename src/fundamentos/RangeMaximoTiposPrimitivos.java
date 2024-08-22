package fundamentos;

public class RangeMaximoTiposPrimitivos {
    public static void main(String[] args) {
        // Companhia de vôo

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estarDeFerias = false; // ou true

        // Tipo caractere
        char status = 'A'; //"Ativo"

        //usando as variaveis

        System.out.println("O funcionário está na empresa há " + (anosDeEmpresa * 365) + " dias, parabéns!!");
        System.out.println("As viagens foram todas de vôo direto então o ato de ir e " +
        "voltar conta como 1 viagem, logo, o funcionário fez " + (numeroDeVoos / 2) + " viagens, parabéns");
        System.out.println("O funcionário recebe o total de " + (pontosAcumulados / vendasAcumuladas) + " pontos por venda de passagem aérea");
        System.out.println("O funcionário "+id+ " ganha: R$"+salario+" por mês");
        System.out.println("O funcionário está de férias? Férias = "+estarDeFerias);
        System.out.println("O status do funcionário é "+status);

    }
}
