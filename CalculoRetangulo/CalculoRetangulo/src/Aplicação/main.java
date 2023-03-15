package Aplicação;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Retangulo;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Programas de calculo Retangulo com entidades");
		System.out.println("Para calcular o retangulo insira: ");
		
		System.out.print("Sua Largura: ");
		ret.largura = sc.nextDouble();
		
		System.out.print("Sua Altura: ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", ret.area());
		System.out.printf("PERIMETRO: %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", ret.diagonal());
		sc.close();
		
	}

}
