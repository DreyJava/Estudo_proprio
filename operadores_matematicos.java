package atv2_cadastroUsuario;

public class operadores_matematicos {
	public static void main(String[] args) {
		int nota1 = 4;
		int nota2 = 7;
		int nota3 = 6;
		
		int soma = nota1 + nota2 + nota3;
		int mediaErrada = soma / 3;
		
		double mediaCerta = (double) soma / 3;
		
		System.out.println("=== CALCULO DE MEDIA ===");
		System.out.println("Notas: " + nota1 + ", "+ nota2 + ", " + nota3);
		System.out.println("Soma: " + soma);
		System.out.println("Media Errada: " + mediaErrada);
		System.out.println("Media correta: " + mediaCerta);
		
		mediaCerta += 0.5; //bônus de participação
		
		System.out.println("");
		System.out.println("Media com bônus de participação: " + mediaCerta);
		
}
}
