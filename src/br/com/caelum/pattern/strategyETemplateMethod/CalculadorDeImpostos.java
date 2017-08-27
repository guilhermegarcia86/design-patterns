package br.com.caelum.pattern.strategyETemplateMethod;

import br.com.caelum.pattern.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double valor = imposto.calcula(orcamento); 

        System.out.println(valor);

      }
}