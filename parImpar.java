import java.util.Scanner;

public class Parimpar {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Principal ateDez = new Principal();
		
		int numero;
		int contador = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		while(contador <= 10) {
			System.out.println("Informe o número:");
			
			numero = leitor.nextInt();
			ateDez.Parimpar(numero);
			
			contador++;
			
			}
		}
}
		public class Principal {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void Parimpar(int numero) {
		if(numero%2 == 0) {
			System.out.println("O número " + "é par.\n");
		}else {
			System.out.println("O número " + "é ímpar.\n");
		}
	}
}
