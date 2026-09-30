package testeArray;
public class Soma_e_Media {
	public static void main(String[] args) {
		int[] notas = {14, 51, 30, 27, 98, 60};
		int soma = 0;
		double media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		 media = (double) soma / notas.length;
		 
		System.out.printf("Soma: %d\n", soma);
		System.out.printf("Média: %.2f", media);
	}
}