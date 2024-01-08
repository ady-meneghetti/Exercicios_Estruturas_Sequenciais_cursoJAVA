package pacote.Exercicios_Estrutura_Sequencial_cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		Double raio, pi, area;
		
		System.out.println("informe o raio do circulo: ");
		
		raio= teclado.nextDouble();
		pi= 3.14159;
		area= (Math.pow(raio, 2.0) * pi);
		
		System.out.printf("A= %.4f%n", area);
		
	}

}
