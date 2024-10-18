package oo.heranca;

public class Jogador {
    int x = 0;
    int y = 0;

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
