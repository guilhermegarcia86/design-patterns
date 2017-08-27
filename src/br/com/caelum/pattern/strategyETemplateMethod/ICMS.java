package br.com.caelum.pattern.strategyETemplateMethod;

import br.com.caelum.pattern.Orcamento;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
