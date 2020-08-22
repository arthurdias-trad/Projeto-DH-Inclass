package br.com.mgoficina.service;

import java.util.List;
import java.util.UUID;

import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente);
	public Cliente findClienteById(UUID idDoCliente);
	public Cliente findClienteByNome(String nome);
	public List<Cliente> findAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(UUID idDoCliente);
	
}