class Funcionario {
    protected String nome;
    protected int salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }


    public Funcionario(String nome, int salario){
        setNome(nome);
        setSalario(salario);
    }

}