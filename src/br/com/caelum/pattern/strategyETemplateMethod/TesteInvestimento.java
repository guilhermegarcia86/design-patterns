package br.com.caelum.pattern.strategyETemplateMethod;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita("", 500.0);
		
		new RealizadorDeInvestimentos().realiza(conta, new Arrojado());
	}

}
