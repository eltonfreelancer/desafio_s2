package br.com.s2it.main;

import java.util.Scanner;

public class matriz {
	
	  private static Scanner ler;

		public static void main(String[] args) {
			
			System.out.println("Entre com o valor da Matriz N x N: ");
	        
			ler = new Scanner(System.in);

	        int n = ler.nextInt();
	        
	        // Criação da matriz 
	        int matriz[][] = new int[n][n];

	        leMatriz(matriz, n);

	        calculaDiferencaSomaDiagonais(matriz, n);
	    }

		private static void leMatriz(int[][] matriz, int n) {
			// Lê a matriz.
	        for (int i = 0; i < n; i++) {
	            // Informa a linha.
	            System.out.printf("Informe os elementos %da. linha:\n", (i + 1));
	            for (int j = 0; j < n; j++) {
	                // Informa qual número deve se colocar.
	                System.out.printf("m[%d][%d] = ", i, j);
	                matriz[i][j] = ler.nextInt();
	            }
	            // Salta linha para não ficar confuso.
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

	        // Calcula a diferença das somas.
	        int diferenca = somaDiagonal1 - somaDiagonal2;
	        if (diferenca < 0) diferenca *= -1;

	        // Exibe o resultado.
	        System.out.println("A difereça da soma das diagonais é: "+ diferenca);
	        System.out.println("Espero que tenha alcançado o resultado esperado!");
		}

}
