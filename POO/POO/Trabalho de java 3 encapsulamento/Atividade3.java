
class Animal{
    private String nome;
    private String especie;

    public String getConsultaAnimal(){
        return "Nome: " + nome + " - Especie: " + especie;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isBlank())
            this.nome = nome;
    }
}
