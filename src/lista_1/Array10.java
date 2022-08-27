/******************************************************************************

21. Escreva uma classe que armazene valores do usu�rio em um array com 10 n�meros inteiros positivos. 
a. Ao final Exiba na tela:
b. O maior elemento par (se houver);
c. O menor elemento �mpar (se houver);
d. O somat�rio de todos os elementos;
e. A m�dia de todos os elementos.
f. Imprima tamb�m o elemento que da posi��o 3 e 7;
g. Some os valores da posi��o 4 e 8, depois mostre o resultado.
h. Verifique se o valor da posi��o 5 � m�ltiplo do valor da posi��o 9.

*******************************************************************************/

package lista_1;

import java.util.Scanner;

public class Array10 {
	public static void checkVetor(int[] vetor) {
		int maiorPar = 0;
		int menorImpar = 0;
		int total = 0;
		int media;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
			if (i == 0) {
				maiorPar = vetor[i];
				menorImpar = maiorPar;
			} else {
				if (vetor[i] % 2 == 0 && vetor[i] > maiorPar) {
					maiorPar = vetor[i];
				} else if (vetor[i] % 2 != 0 && vetor[i] < menorImpar) {
					menorImpar = vetor[i];
				}
			}

		}
		media = total / vetor.length;
		
		if (maiorPar % 2 == 0) {
			System.out.println("O maior elemento par � " + maiorPar);
		}else {
			System.out.println("N�o h� um n�mero maior par. ");
		}
		if (menorImpar % 2 != 0 && menorImpar > 0){
			System.out.println("O menor elemento �mpar � " + menorImpar);
		}else {
			System.out.println("N�o h� um menor lemento �mpar.");
		}
		System.out.println("O somat�rio de todos os elementos � " + total);
		System.out.println("A m�dia de todos os elementos � " + media);
		System.out.printf("O elemento da posi��o 3 � %d e o da posi��o 7 � %d \n", vetor[3], vetor[7]);
		System.out.printf("Os valores da posi��o 4 e 8 somados � %d + %d = %d \n", vetor[4], vetor[8], vetor[4] + vetor[8]);
		if(vetor[5] % vetor[9] == 0) {
			System.out.println("O valor da posi��o 5 � m�ltiplo do valor da posi��o 9.");
		}else {
			System.out.println("O valor da posi��o 5 n�o � m�ltiplo do valor da posi��o 9.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o numero na posi��o %d: ", i);
			vetor[i] = scan.nextInt();
		}

		checkVetor(vetor);

	}
}
