package pacote.Exercicios_Estrutura_Sequencial_cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		float A, B, C, triangulo, circulo, quadrado, trapezio, retangulo, pi;
		
		System.out.println("Valor 1: ");
		A= teclado.nextFloat();
		
		System.out.println("Valor 2: ");
		B=teclado.nextFloat();
		
		System.out.println("Valor 3: ");
		C=teclado.nextFloat();
		
		pi= 3.14159f;
		triangulo= (A*C/2);
		circulo= (float) (Math.pow(C, 2.0) * pi);
		trapezio= ((A+B)*C/2);
		quadrado= (float) (Math.pow(B, 2.0));
		retangulo=(A*B);
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		

	}

}
