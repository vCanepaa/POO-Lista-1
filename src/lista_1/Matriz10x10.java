/******************************************************************************

24. Escreva uma classe que receba do usu�rio valores num�ricos inteiros positivos e preencha uma 
matriz de 10 x 10. A final leia os elementos que N�O se encontram na diagonal desta matriz.

*******************************************************************************/

package lista_1;

import java.util.Scanner;

public class Matriz10x10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matriz[][] = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("Digite o numero na posi��o %d, %d: ", i, j);
				matriz[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i != j) {
					System.out.printf("[%d]\t", matriz[i][j]);
				}

			}
			System.out.println();
		}

	}
}
