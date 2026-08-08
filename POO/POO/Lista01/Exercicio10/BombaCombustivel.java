package Lista01.Exercicio10;

public class BombaCombustivel {

    protected String tipoCombustivel;
    protected double valorLitro;
    protected double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;

        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecido: " + litros + " litros");
            System.out.println("Restante na bomba: " + quantidadeCombustivel + " litros");
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorTotal = litros * valorLitro;

        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Valor a pagar: R$ " + valorTotal);
            System.out.println("Restante na bomba: " + quantidadeCombustivel + " litros");
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }
}
