package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palavraInicial, palavraFinal;
	
		System.out.println("Informe uma palavra: ");
		palavraInicial = sc.next();
	
		char[] entrada = new char[palavraInicial.length()];
		char[] saida = new char[palavraInicial.length()];
		
		for(int i = 0; i < palavraInicial.length(); i++) {
			entrada[i] = palavraInicial.charAt(i);
		}
		
		for(int i = 0; i < entrada.length  ; i++) {
			saida[i] = entrada[entrada.length - 1 -i];
		}
		
		palavraFinal = String.valueOf(saida);
		
		System.out.println(palavraFinal);
	}
}
