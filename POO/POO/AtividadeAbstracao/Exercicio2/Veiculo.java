/*Criar classe abstrata Veiculo com:
– Atributos: marca, modelo.
– Método abstrato acelerar().
– Método concreto exibirDados().
• Criar classes Carro e Moto.
• Instanciar objetos e testar os métodos. */

package AtividadeAbstracao.Exercicio2;

abstract  class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void acelerar();
    
    public void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    


}
