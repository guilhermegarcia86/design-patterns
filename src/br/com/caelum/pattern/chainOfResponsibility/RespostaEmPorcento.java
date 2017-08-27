package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.strategyETemplateMethod.Conta;

public class RespostaEmPorcento implements Resposta {

	private Resposta outraResposta;
	
	public RespostaEmPorcento(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if(outraResposta != null){
			outraResposta.responde(req, conta);
		}else {
			System.out.println("Fim da Resposta.");
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}

}
