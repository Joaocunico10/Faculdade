public class Loja extends MetodoPagamento {
    public Loja(double  valor){
        this.valor = valor;
        
        if(valor > 0){
            System.out.println("Compra finalizada!");
        }
        else{
            System.out.println("Ocorreu um erro, tente novamente mais tarde!");
        }
    }

}
