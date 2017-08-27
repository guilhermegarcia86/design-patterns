package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.strategyETemplateMethod.Conta;

public class RespostaEmCsv implements Resposta {

	private Resposta outraResposta;
	
	public RespostaEmCsv(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

    public void responde(Requisicao req, Conta conta) {
      if(req.getFormato() == Formato.CSV) {
        System.out.println(conta.getTitular() + "," + conta.getSaldo());
      }
      else if(outraResposta != null){
        outraResposta.responde(req, conta);
      }else{
    	  System.out.println("Resposta não encontrada.");
      }
    }

    public void setProxima(Resposta resposta) {
      this.outraResposta = resposta;
    }

}
