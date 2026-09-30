package testeArray;
public class Par_e_Impar {
	public static void main(String[] args) {
		int[] numeros = {74, 15, 92, 80, 46, 14, 76, 77, 66, 62};
		int par = 0, impar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " é par");
				par++;
			} else {
				System.out.println(numeros[i] + " é impar");
				impar++;
			}
		}
		
		System.out.printf("\nPares: %d\n", par);
		System.out.printf("Ímpares: %d", impar);
	}
}