package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.desconta(orcamento);
		}
	}
	
}