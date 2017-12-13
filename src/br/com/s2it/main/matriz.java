package br.com.s2it.main;

import java.util.Scanner;

public class matriz {
	
	  private static Scanner ler;

		public static void main(String[] args) {
			
			System.out.println("Entre com o valor da Matriz N x N: ");
	        
			ler = new Scanner(System.in);

	        int n = ler.nextInt();
	        
	        // Cria��o da matriz 
	        int matriz[][] = new int[n][n];

	        leMatriz(matriz, n);

	        calculaDiferencaSomaDiagonais(matriz, n);
	    }

		private static void leMatriz(int[][] matriz, int n) {
			// L� a matriz.
	        for (int i = 0; i < n; i++) {
	            // Informa a linha.
	            System.out.printf("Informe os elementos %da. linha:\n", (i + 1));
	            for (int j = 0; j < n; j++) {
	                // Informa qual n�mero deve se colocar.
	                System.out.printf("m[%d][%d] = ", i, j);
	                matriz[i][j] = ler.nextInt();
	            }
	            // Salta linha para n�o ficar confuso.
	            System.out.printf("\n");
	        }
		}
		
		private static void calculaDiferencaSomaDiagonais(int[][] matriz, int n) {
			// Calcula a soma das diagonais.
	        int somaDiagonal1 = 0, somaDiagonal2 = 0;
	        
	        for (int i = 0; i < n; i++) {
	            somaDiagonal1 += matriz[i][i];
	            somaDiagonal2 += matriz[n - 1 - i][i];
	        }

	        // Calcula a diferen�a das somas.
	        int diferenca = somaDiagonal1 - somaDiagonal2;
	        if (diferenca < 0) diferenca *= -1;

	        // Exibe o resultado.
	        System.out.println("A difere�a da soma das diagonais �: "+ diferenca);
	        System.out.println("Espero que tenha alcan�ado o resultado esperado!");
		}

}
