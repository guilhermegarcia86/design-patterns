package br.com.caelum.pattern.strategyETemplateMethod;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
