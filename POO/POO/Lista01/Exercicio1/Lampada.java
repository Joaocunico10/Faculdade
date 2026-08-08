package Lista01.Exercicio1;

class Lampada {
    boolean ligada;
    int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Lampada ligada!!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lampada desligada!!");
    }

    public void meialuz() {
        ligada = true;
        System.out.println("Lampada ligada, porem em meia luz " + (potencia / 2));
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está LIGADA.");
        } else {
            System.out.println("A lâmpada está DESLIGADA.");
        }
    }

}
