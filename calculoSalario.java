public class NovoSalario {
	
	public void novosal(double salario,double porcentagem) {
		double novosal = salario + (salario*porcentagem)/100;
		System.out.println("Novo salario: " + novosal);
	}
}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		NovoSalario calc = new NovoSalario();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu salário?");
		int salario = leitor.nextInt();
		
		System.out.println("Qual a porcentagem do aumento?");
		double porcentagem = leitor.nextInt();
		calc.novosal(salario, porcentagem);
		
		leitor.close();

	}

}
