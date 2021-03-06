package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	private List<Cliente> clientes;
	
	public ClienteServiceImpl() {
		clientes = new ArrayList<Cliente>();
	}
	public ClienteServiceImpl(List<Cliente> clientes) {
		this.clientes = new ArrayList<>(clientes);
	} 
	
	
	@Override
	public Cliente create(Cliente cliente) throws DataIntegrityException {
		if(cliente.getIdade() < 18) {
			throw new DataIntegrityException("idade");
		}
		cliente.setIdDoCliente(UUID.randomUUID());
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findClienteById(UUID idDoCliente)throws ObjectNotFoundException {
		for(Cliente cliente: this.clientes) {
			if(cliente.getIdDoCliente().equals(idDoCliente)) {
				return cliente;
			}
		}
		throw new ObjectNotFoundException("Cliente");
	}

	@Override
	public Cliente findClienteByNome(String nome) throws ObjectNotFoundException  {
		
		for(Cliente cliente: this.clientes) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		throw new ObjectNotFoundException("Cliente");
	}

	@Override
	public List<Cliente> findAll() {
		return Collections.unmodifiableList(this.clientes);
	}

	@Override
	public boolean updateCliente(Cliente cliente) {
		
		if(this.clientes.contains(cliente)) {
			
			int indiceDoObjeto = this.clientes.indexOf(cliente);
			this.clientes.remove(cliente);
			this.clientes.add(indiceDoObjeto, cliente);
			return true;
			
		}else {		
			
			return false;
			
		}
		
	}

	@Override
	public boolean deleteCliente(Cliente cliente) {
		if (this.clientes.contains(cliente)) {
			this.clientes.remove(cliente);
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
