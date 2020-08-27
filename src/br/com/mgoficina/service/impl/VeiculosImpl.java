package br.com.mgoficina.service.impl;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculos;
import exception.MissingDataException;

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
	public Veiculo create(Veiculo veiculo) throws MissingDataException {
		
		if (veiculo.getAno() != null &&
			  veiculo.getChassi() != null &&
				veiculo.getCor() != null &&
				  veiculo.getModelo() != null &&
					veiculo.getPlacaDoVeiculo() != null &&
					  veiculo.getProprietario() != null &&
						veiculo.getTipoDeVeiculo() != null) {
			this.veiculos.add(veiculo); 
			return veiculo;
			} else {
				throw new MissingDataException("Todos os campos de criação do veículo devem ser preenchidos");
			}
		} 
	
	@Override
	public Veiculo findByChassis(String chassis) {
		for (Veiculo veiculo: this.veiculos) {
			if (veiculo.getChassi().equals(chassis)) {
				return veiculo;
			}			
		} return null;
	} 

	@Override
	public List<Veiculo> findByCliente(Cliente cliente) {
		return Collections.unmodifiableList(cliente.getVeiculos());
	}

	@Override
	public List<Veiculo> findAll() {
		return Collections.unmodifiableList(this.veiculos);
	}
	

	@Override
	public boolean updateVeiculo(Veiculo veiculo) {
		if (this.veiculos.contains(veiculo)) {
			int indiceDoObjeto = this.veiculos.indexOf(veiculo);
			this.veiculos.remove(indiceDoObjeto);
			this.veiculos.add(indiceDoObjeto, veiculo);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteVeiculo(Veiculo veiculo) {
		if(this.veiculos.contains(veiculo)) {
			this.veiculos.remove(veiculo);
			return true;
		}
		return false;
	}

}
