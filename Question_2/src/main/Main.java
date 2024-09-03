package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = 1;
		int n1 = 1, n2 = 1, n3 = 2; 
		int num , b, c;
		
		System.out.println("Informe um número");
		num = sc.nextInt();
		
		if (num == 2 || num == 1 || num == 0) {
			System.out.println("O Número pertence a sequência de Fibonacci");
		}
		
		else {
			while (n == 1) {
				while(n3<num) {
					b = n2;
					c = n3;
					n3 = n2 + n1;
					n2 = c;
					n1 = b;
					if (num == n3) {
						System.out.println("O Número pertence a sequência de Fibonacci");
					}
				
				}
				if (n3>num) {
					n = 0;
					System.out.println("O Número não pertence a sequência de Fibonacci");
				}	
			}
	
		}	
	}
}
