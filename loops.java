package atv2_cadastroUsuario;

public class loops {
	public static void main(String[] args) {
	int opcao = 3;
	
	do {
		System.out.println("1 - Somar | 2 - Subtrair | 3 - Sair");
		
		if(opcao == 1) {
			System.out.println(" 1 + 1 = " + (1+1));
		}
		else if(opcao == 2) {
			System.out.println(" 10 - 5 = " + (10-5));
		}
		else if(opcao == 3) {
			System.out.println("Saindo...");
			break;
		}
		else {
			System.out.println("Opção inválida");
		}
		
	} while(true);
}
	
	// for e while funcionam igual no js
	//for(int i = 0; i < 5; i++) {}
	//int i = 0;
	//while(i < 5) {}
}