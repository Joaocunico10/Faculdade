

class Aluno{
    private String nome;
    private double nota;

    public double getNota(){
        return nota;
    }

    public void  setAdicionarNota(double nota){
        if(nota > 0 && nota <= 10){
            this.nota = nota;
        }
    }

    public void removerNota(double valor){
        if(valor <= nota){
            this.nota -= valor;
        }
    }
}
