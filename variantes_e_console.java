package atv2_cadastroUsuario;

public class variantes_e_console {
	public static void main(String[] args) {
		String nome = "Andrey";
		int idade = 19;
		char sexo = 'M';
		double altura = 1.87;
		boolean estudante = true;
		
		System.out.println("=== FICHA DE CADASTRO ===");
		System.out.print("Nome: ");
		System.out.println(nome);
		System.out.println("Idade: " + idade + "anos");
		System.out.println("Sexo: " + sexo);
		System.out.println("Altura: " + altura + "m");
		System.out.print(nome + " tem " + idade + " anos e é estudante " + estudante);
}
}
