package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

	public static void main(String[] args) {
		System.out.println("--- Iniciando o Sistema FiapRide --- \n");
		
		Veiculos veiculo1 = new Veiculos("Carlos", "ABC-1234");
		System.out.println("Abastecimento do veículo 1: ");
		veiculo1.adicionarGasolina(50);
		veiculo1.gastarGasolina(100);
		veiculo1.gastarGasolina(25);
		
		System.out.println("Dono: " + veiculo1.getIndividuo() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina());

	}

}
