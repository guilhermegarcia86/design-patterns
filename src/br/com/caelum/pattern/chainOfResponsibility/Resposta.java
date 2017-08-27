package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.strategyETemplateMethod.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}
