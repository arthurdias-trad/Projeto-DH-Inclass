package br.com.mgoficina.service;

import java.util.List;
import java.util.UUID;

import br.com.mgoficina.exception.MissingDataException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;

public interface IServicoService {
	
	public Servico create(Servico servico);
	public Servico findById(UUID idDaOrdem) throws ObjectNotFoundException;
	public List<Servico> findByCliente(Cliente cliente) throws MissingDataException;
	public List<Servico> findAll();
	public boolean updateServico(Servico servico);
	public boolean deleteServico(Servico servico);
	
}
