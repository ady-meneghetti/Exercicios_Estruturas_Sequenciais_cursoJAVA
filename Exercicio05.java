package pacote.Exercicios_Estrutura_Sequencial_cursoJava;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		Double Valor1, Valor2, ValorTotal;
		int id1, id2, qt1, qt2;
		
		System.out.println("Codigo da peca 1: ");
		id1=teclado.nextInt();
		
		System.out.println("Quantidade de pecas 1: ");
		qt1=teclado.nextInt();
		
		System.out.println("Valor unitario da peca 1: ");
		Valor1=teclado.nextDouble();
		
		System.out.println("Codigo da peca 2: ");
		id2=teclado.nextInt();
		
		System.out.println("Quantidade de pecas 2: ");
		qt2=teclado.nextInt();
		
		System.out.println("Valor unitario da peca 2: ");
		Valor2=teclado.nextDouble();
		
		ValorTotal= (qt1*Valor1 + qt2*Valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorTotal);
		
		

	}

}
