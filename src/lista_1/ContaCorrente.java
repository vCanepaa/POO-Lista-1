/******************************************************************************

29. Construa um m�dulo que, dado um n�mero de conta corrente com cinco d�gitos, retorne seu d�gito 
verificador, o qual � calculado da seguinte forma:
Exemplo: n�mero da conta: 25678
� Somar n�meros da conta com seu inverso: 25678 + 87652 = 113330;
� Multiplicar cada d�gito por sua ordem posicional e somar o resultado:
Conta: 1 1 3 3 3 0
Multiplica Posi��o pela ordem: 1 * 1 2 * 1 3 * 3 4 * 3 5 * 3 6 * 0
Soma resultado: 1 + 2 + 9 + 12 + 15 + 0 = 39
� O �ltimo deste resultado � o d�gito verificador da conta (39 - 9).
� Resultado da conta com o d�gito verificador: 25678-9

*******************************************************************************/

//Imcompleta!

package lista_1;

import java.util.Scanner;

public class ContaCorrente {
	public static void verificador() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a conta: ");
		Integer conta = scan.nextInt();
		Integer contaInver;
		String contaString = conta.toString();
		String contaStrInver = "";
		Integer vetor[] = new Integer[5];

		for (int i = contaString.length(); i > 0; i--) {
			contaStrInver += contaString.substring(i - 1, i);
		}

		contaInver = Integer.parseInt(contaStrInver);

		conta = conta + contaInver;

		contaString = conta.toString();

		for (int i = 0; i < contaString.length(); i++) {
			String a;
			a = contaString.substring(i);
			vetor[i] = Integer.parseInt(a);
			System.out.println(vetor[i]);
		}

	}

	public static void main(String[] args) {
		verificador();
	}
}
