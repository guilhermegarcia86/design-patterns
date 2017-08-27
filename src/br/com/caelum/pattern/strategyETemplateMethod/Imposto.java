package br.com.caelum.pattern.strategyETemplateMethod;

import br.com.caelum.pattern.Orcamento;

public interface Imposto {
	double calcula(Orcamento orcamento);
}
