package br.com.caelum.pattern.strategyETemplateMethod;

public class RealizadorDeInvestimentos {
	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.deposita("", resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
