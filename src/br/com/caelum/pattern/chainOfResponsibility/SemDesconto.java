package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.Orcamento;

public class SemDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }

}