package br.com.fiapride.model;

public class Veiculos {
	//adiciona os atributos de form PRIVADA
	private String individuo;
	private String placa;
	private double gasolina;

	
	//torna obrigatorio informar individuo e placa
	public Veiculos(String individuo, String placa) {
		this.setIndividuo(individuo);
		this.setPlaca(placa);
		this.setGasolina(0);
	}
	
	public void adicionarGasolina(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor a ser adicionado deve ser maior que zero.");
			return;
		}
		this.gasolina += valor;
		System.out.println("Gasolina adicionada. Gasolina atual: " + this.gasolina);
	}
		
	public void gastarGasolina(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: o valor é inválido.");
			return;
		} else if (this.gasolina < valor) {
			System.out.println("Erro: a gasolina é insuficiente.");
			return;
		}
		this.gasolina -= valor;
		System.out.println("Gasolina gasta. Gasolina atual: " + this.gasolina);
	}
	
	//faz leitura do nome do individuo
	public String getIndividuo() {
		return this.individuo;
	}
	
	//define o individuo
	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getGasolina() {
		return this.gasolina;
	}
	
	//define a gasolina sem deixar que seja alterada diretamente
	private void setGasolina(double valor) {
		if (valor >= 0) {
			this.gasolina = valor;
		} else {
			System.out.println("Erro de Segurança: Tentativa de definir gasolina negativa bloqueada!");
		}
	}
}