package br.com.caelum.pattern.strategyETemplateMethod;

public class Conta {

	private String titular;
	private double saldo;

	public void deposita(String titular, double valor) {
		this.titular = titular;
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}