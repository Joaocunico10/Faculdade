public class Main{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 1500);
        Gerente gerente1 = new Gerente("Luis", 2000, "Inteligencia");

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());

        System.out.println();

        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salario: " + gerente1.getSalario());
        System.out.println("Setor: " + gerente1.getSetor());

    }
}
