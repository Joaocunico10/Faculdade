import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> lista = new ArrayList<>();

        Item i1 = new Item();
        i1.nome = "Arroz";
        i1.preco = 25.50;

        Item i2 = new Item();
        i2.nome = "Feijão";
        i2.preco = 8.90;

        lista.add(i1);
        lista.add(i2);

        for (Item item : lista) {
            System.out.println(item); // chama toString automaticamente
        }
    }
}