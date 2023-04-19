package metodosConstrutores;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee chefe = new Employee("Bruno", "Ferreira", 15000);
		Employee gerente = new Employee ("Ana", "Cardoso", 7000);
		
		System.out.println("Mostrando o salário anual dos empregados");
		System.out.println("Salário anual do "+chefe.getNome()+" é R$"+chefe.getSalarioMensal()*12);
		System.out.println("Salário anual do "+gerente.getNome()+" é R$"+gerente.getSalarioMensal()*12);
		
		System.out.println("Aumentando em 10% os salários dos empregados");
		double novoSalarioChefe = chefe.getSalarioMensal()*1.1;
		chefe.setSalarioMensal(novoSalarioChefe);
		
		double novoSalarioGerente = gerente.getSalarioMensal()*1.1;
		gerente.setSalarioMensal(novoSalarioGerente);
		
		System.out.println("Mostrando os novos salários....");
		System.out.println("Salário anual do "+chefe.getNome()+" é R$"+chefe.getSalarioMensal()*12);
		System.out.println("Salário anual do "+gerente.getNome()+" é R$"+gerente.getSalarioMensal()*12);
		
		
	}

}
