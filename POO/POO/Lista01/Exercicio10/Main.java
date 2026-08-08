package Lista01.Exercicio10;

public class Main {
    public static void main(String[] args) {

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 100);

        bomba.abastecerPorValor(55);
        bomba.abastecerPorLitro(20);

        bomba.abastecerPorLitro(200);
    }
}
