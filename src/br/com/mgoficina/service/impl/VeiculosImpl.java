package br.com.mgoficina.service.impl;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeiculosImpl implements IVeiculos {
	
	private ArrayList<Veiculo> veiculos;
	
	public VeiculosImpl() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public VeiculosImpl(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	}
	
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public void cadastrarVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		this.veiculos.add(veiculo); 
				
	}

	@Override
	public String infoVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
		String placaDoVeiculo = veiculo.getPlacaDoVeiculo();
		String modelo = veiculo.getModelo();
		String cor = veiculo.getCor(); 
		LocalDate ano = veiculo.getAno();
		String chassi = veiculo.getChassi();
		String tipoDeVeiculo = veiculo.getTipoDeVeiculo();
				
		String info = 
		tipoDeVeiculo + "/n" + 
		"Modelo: " + modelo + "/n" +
		"Ano: " + ano + "/n" +
		"Cor: " + cor + "/n" +
		"Placa do Veículo: " + placaDoVeiculo + "/n" +
		"Chassi: " + chassi;
		return info;
		}

	@Override
	public void atualizarCadastroVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		if (this.veiculos.contains(veiculo)) {
			int indice = this.veiculos.indexOf(veiculo);
			veiculos.remove(indice);
			veiculos.add(indice, veiculo);
		} else {
			System.out.println("Veiculo ainda não consta no sistema");
		}
}

	@Override
	public void removerCadastroVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		if (this.veiculos.contains(veiculo)) {
			int indice = this.veiculos.indexOf(veiculo);
			veiculos.remove(indice);
			System.out.println("Veículo removido com sucesso");
		} else {
			System.out.println("Veiculo ainda não cadastrado no sistema");
		}
		
	} 
	
	

}
