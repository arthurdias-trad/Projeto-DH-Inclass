package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.MissingDataException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculos {
	
	public Veiculo create(Veiculo veiculo) throws MissingDataException;	
	public Veiculo findByChassis(String chassis) throws ObjectNotFoundException;
	public List<Veiculo> findByCliente (Cliente cliente) throws ObjectNotFoundException;
	public List<Veiculo> findAll();
	public boolean updateVeiculo (Veiculo veiculo);
	public boolean deleteVeiculo(Veiculo veiculo);
	
	
}
