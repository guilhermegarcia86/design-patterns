package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.strategyETemplateMethod.Conta;

public class RespostaEmXml implements Resposta {

	private Resposta outraResposta;
	
	public RespostaEmXml(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else if(outraResposta != null){
			outraResposta.responde(req, conta);
		}else{
			System.out.println("Fim do fluxo ou formato não encontrado");
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}

}
