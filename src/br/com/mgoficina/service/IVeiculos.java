package br.com.mgoficina.service;

import java.util.List;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculos {
	
	public boolean create(Veiculo veiculo);	
	public Veiculo findByChassis(String chassis);
	public List<Veiculo> findByCliente (Cliente cliente);
	public List<Veiculo> findAll (Cliente cliente);
	public boolean updateVeiculo (Veiculo veiculo);
	public boolean deleteVeiculo(Veiculo veiculo);
	
	
}
