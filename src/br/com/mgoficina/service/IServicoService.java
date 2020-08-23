package br.com.mgoficina.service;

import java.util.List;
import java.util.UUID;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;

public interface IServicoService {
	
	public Servico create(Servico servico);
	public Servico findById(UUID idDaOrdem);
	public List<Servico> findByCliente(Cliente cliente);
	public List<Servico> findAll();
	public boolean updateServico(Servico servico);
	public boolean deleteServico(Servico servico);
	
}
