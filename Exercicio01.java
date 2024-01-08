package pacote.Exercicios_Estrutura_Sequencial_cursoJava;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in); 
			
			int val1, val2, soma;
			
	System.out.println("Digite o primeiro numero: ");		
			val1= teclado.nextInt();
	
	System.out.println("Digite o segundo numero: ");
			val2= teclado.nextInt();
			
			soma= (val1+val2);
			
	System.out.println("SOMA= " +soma);
	
	
			
	}	

}