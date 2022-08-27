/******************************************************************************
 
25. Construa dois m�todos, um para guardar 4 n�meros informado pelo usu�rio e guardar em cada 
posi��o de um array. No segundo m�todo, retorne e imprima o inverso desses n�meros. Exemplo: 
N�meros informado: 5 3 7 4 -> N�meros retornados: 4 7 3 5.

*******************************************************************************/

package lista_1;

import java.util.Scanner;

public class NumInvertido {
	public static void inverNumeros(int[] numeros) {
		int numerosInver[] = new int[4];
		int cont = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		
		System.out.print(" -> ");
		
		for (int i = numeros.length -1; i > -1; i--) {
			numerosInver[cont] = numeros[i];
			System.out.print(numerosInver[cont]);
			cont++;
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[4];

		for (int i = 0; i < numeros.length; i++) {

			System.out.printf("Dite o %d� n�mero: \n", i + 1);
			numeros[i] = scan.nextInt();
		}
		
		inverNumeros(numeros);
	}
}
