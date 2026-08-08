package Lista01.Exercicio9;

import java.util.Random;

public class Dado {

    public int rolar() {
        Random random = new Random();
        return random.nextInt(6) + 1; // 1 a 6
    }
}
