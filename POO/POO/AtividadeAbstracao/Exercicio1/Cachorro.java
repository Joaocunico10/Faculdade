
package AtividadeAbstracao.Exercicio1;

class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("Auuuuuu, late coracao cachorro late");
    }

}
