package testeArray;
public class Maior_e_Menor {
	public static void main(String[] args) {
		int[] numeros = {23, 5, 67, 12, 89, 3};
		int  maiorValor = numeros[0], menorValor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
			} 
			
			if(numeros[i] < menorValor) {
				menorValor = numeros[i];
			}
		}
		
		System.out.printf("Maior valor:%d \n", maiorValor );
		System.out.printf("Menor valor:%d ", menorValor );

	}
}