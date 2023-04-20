package Questao_6;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		        
		System.out.print("Digite o salário fixo do funcionário: ");
		double salarioFixo = scanner.nextDouble();
		        
		System.out.print("Digite o valor das vendas do funcionário: ");
		double valorVendas = scanner.nextDouble();
		              
		double comissao = valorVendas * 0.04;
		double salarioFinal = salarioFixo + comissao;
		        	        
		System.out.println("Comissão: " + comissao);
		System.out.println("Salário final: " + salarioFinal);
	}
}