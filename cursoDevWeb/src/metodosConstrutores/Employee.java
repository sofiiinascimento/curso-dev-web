package metodosConstrutores;

public class Employee {
	private String nome;
	private String ultimoNome;
	private double salarioMensal;
	
	public Employee(String primeiroNome, String ultimoNome, double salarioMensal) {
		this.nome = primeiroNome;
		this.ultimoNome = ultimoNome;
		
		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoPrimeiroNome) {
		this.nome = nome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
}
