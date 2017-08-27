package br.com.caelum.pattern.chainOfResponsibility;

import br.com.caelum.pattern.Item;
import br.com.caelum.pattern.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Item lapis = new Item("LAPIS", 15.00);
        Item caneta = new Item("CANETA", 15.00);
        Item borracha = new Item("borracha", 15.00);
		
		Orcamento orcamento = new Orcamento(499.0);
		orcamento.adicionaItem(caneta);
		orcamento.adicionaItem(lapis);
		orcamento.adicionaItem(borracha);
		
		CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
		double desconto = calculadorDeDescontos.calcula(orcamento);
		
		System.out.println(desconto);

	}

}
