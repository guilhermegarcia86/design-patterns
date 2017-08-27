package br.com.caelum.pattern.strategyETemplateMethod;

import br.com.caelum.pattern.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);

		// Calculo de ICCC
		calculador.realizaCalculo(orcamento, new ICCC());

	}
}