import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();

        lista.add(new Retangulo());
        lista.add(new Circulo());
        lista.add(new Retangulo());

        double soma = 0;

        for (Forma f : lista) {
            soma += f.area();
        }

        System.out.println("Soma das areas: " + soma);
    }
}