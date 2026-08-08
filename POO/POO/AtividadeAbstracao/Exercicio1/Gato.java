package AtividadeAbstracao.Exercicio1;

class Gato extends Animal {

    Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("Miauuuu");
    }

}
