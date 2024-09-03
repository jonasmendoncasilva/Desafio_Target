package main;

public class Main {

	public static void main(String[] args) {
		
		double[] vet = {22174.1664, 24537.6698, 26139.6134, 
				0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
				11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563,
				48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,
				18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318,
				1718.1221, 13220.495, 8414.61}; 
		
		double maior = 0, menor = vet[0], soma = 0, media = 0;
		int contador = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
			}	
			
			if (vet[i] != 0) {
				if (vet[i] < menor) {
					menor = vet[i];
				}
				contador++;
			}
			
			soma += vet[i];
		}
		
		media = soma / contador;
		contador = 0;
		for(int i = 0; i < vet.length; i++) {
			if (vet[i] != 0 && vet[i] > media) {
				contador++;
			}
		}	
		System.out.println("O menor valor de faturamento: "+menor+"\n"
				+"O maior valor de faturamento: "+maior+"\n"
				+"O maior valor de faturamento: "+contador+"\n");
	}
}
