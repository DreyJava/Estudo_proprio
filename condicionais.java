package atv2_cadastroUsuario;

public class condicionais {
	public static void main(String[] args) {
		
		// ================ MENU ================
		
		double primeirosDigitos = 1000; // ESCREVA AQUI
		double segundosDigitos = 20; // ESCREVA AQUI
		char operacao = '%';              // ESCREVA AQUI
		
		//=======================================
		
		double resultado;
		
		if(operacao == '+') {
		resultado = primeirosDigitos + segundosDigitos;
		System.out.println("Conta: " + primeirosDigitos + " " + operacao + " " + segundosDigitos);
		System.out.println("Resultado: " + resultado);	
		} 
		else if(operacao == '-') 
		{
			resultado = primeirosDigitos - segundosDigitos;
			System.out.println("Conta: " + primeirosDigitos + " " + operacao + " " + segundosDigitos);
			System.out.println("Resultado: " + resultado);	
		}
		else if(operacao == '*' ) {
			resultado = primeirosDigitos * segundosDigitos;
			System.out.println("Conta: " + primeirosDigitos + " " + operacao + " " + segundosDigitos);
			System.out.println("Resultado: " + resultado);	
		}
		else if(operacao == '/' && segundosDigitos != 0) {
			resultado = primeirosDigitos / segundosDigitos;
			System.out.println("Conta: " + primeirosDigitos + " " + operacao + " " + segundosDigitos);
			System.out.println("Resultado: " + resultado);	
		}
		else if(operacao == '%') {
			resultado = primeirosDigitos % segundosDigitos;
			System.out.println("Conta: " + primeirosDigitos + " " + operacao + " " + segundosDigitos);
			System.out.println("Resultado: " + resultado);		
		}
		else {//Erros
			if(operacao == '/' && segundosDigitos == 0) {
			System.out.println("Impossivel dividir por zero!");	
			return;
			}
			System.out.print("OPERAÇÃO INVALIDA");
		}
}
}