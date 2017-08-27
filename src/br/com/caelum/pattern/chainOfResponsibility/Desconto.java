package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.Orcamento;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
