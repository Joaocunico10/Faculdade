
public class Gerente extends Funcionario {
    private String setor;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public Gerente(String nome, int salario, String setor) {
        super(nome, salario);
        setSetor(setor);
    }
}
