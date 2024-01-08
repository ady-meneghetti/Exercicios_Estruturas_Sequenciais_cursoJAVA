package pacote.Exercicios_Estrutura_Sequencial_cursoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
	
		System.out.println("digite valor A: ");
		A= teclado.nextInt();
		
		System.out.println("digite valor B: ");
		B= teclado.nextInt();
		
		System.out.println("digite valor C: ");
		C= teclado.nextInt();
		
		System.out.println("digite valor D: ");
		D= teclado.nextInt();
		
		DIFERENCA= (A*B - C*D);
		
		System.out.println("DIFERENCA= " +DIFERENCA);
		
		

	}

}
