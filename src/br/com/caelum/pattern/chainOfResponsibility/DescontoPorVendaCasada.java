package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (this.aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return this.existe("CANETA", orcamento) && this.existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {

		return orcamento.getItens().stream().anyMatch(item -> item.getNome().equals(nomeDoItem));

	}

}