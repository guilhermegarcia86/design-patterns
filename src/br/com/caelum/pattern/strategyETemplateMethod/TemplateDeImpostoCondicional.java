package br.com.caelum.pattern.strategyETemplateMethod;

import br.com.caelum.pattern.Orcamento;

// Design Pattern Template Method
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
