package main;

public class Main {

	public static void main(String[] args) {
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double soma = 0;
			
		soma = sp + rj + mg + es + outros;
			 
		System.out.print("Porcentagem de SP: "+Math.round((sp/soma)*100)+"% \n");
		System.out.print("Porcentagem de RJ: "+Math.round((rj/soma)*100)+"% \n");
		System.out.print("Porcentagem de MG: "+Math.round((mg/soma)*100)+"% \n");
		System.out.print("Porcentagem de ES: "+Math.round((es/soma)*100)+"% \n");
		System.out.print("Porcentagem de Outros: "+Math.round((outros/soma)*100)+"% \n");
	
	}
}
