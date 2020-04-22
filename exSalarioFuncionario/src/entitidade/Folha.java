package entitidade;

public class Folha {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	public double aumento(double porcentagem) {
		double p = (salarioBruto / 100) * porcentagem;
		return salarioBruto + p - imposto;
		
					
	}
}
