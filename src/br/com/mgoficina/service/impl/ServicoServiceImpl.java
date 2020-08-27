package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import br.com.mgoficina.exception.MissingDataException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.service.IServicoService;

public class ServicoServiceImpl implements IServicoService {

	private List<Servico> servicos;
	
	public ServicoServiceImpl() {
		servicos = new ArrayList<Servico>();
	}
	public ServicoServiceImpl(List<Servico> servicos) {
		this.servicos = new ArrayList<Servico>(servicos);
	}

	@Override
	public Servico create(Servico servico) {
		servico.setIdDoServico(UUID.randomUUID());
		
		Cliente clienteDoServico = servico.getCliente();
		ArrayList<Servico> servicosDoCliente = clienteDoServico.getServicos();
		servicosDoCliente.add(servico);
		
//		servico.getCliente().getServicos().add(servico);
		servicos.add(servico);
		return servico;
	}

	@Override
	public Servico findById(UUID idDaOrdem) throws ObjectNotFoundException{
		for(Servico servico: this.servicos) {
			if (servico.getIdDoServico().equals(idDaOrdem)) {
				return servico;
			}
		}
		 throw new ObjectNotFoundException("Serviço");
	}

	@Override
	public List<Servico> findByCliente(Cliente cliente)  throws MissingDataException{
		if (cliente.getServicos().size() == 0) {
			throw new MissingDataException("Cliente ainda não realizou nenhum serviço");
		} else {
		return Collections.unmodifiableList(cliente.getServicos());
	}}

	@Override
	public List<Servico> findAll() {
		return Collections.unmodifiableList(this.servicos);
	}

	@Override
	public boolean updateServico(Servico servico) {
		if(this.servicos.contains(servico)) {
			int indiceDoObjeto = this.servicos.indexOf(servico);
			this.servicos.remove(servico);
			this.servicos.add(indiceDoObjeto, servico);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteServico(Servico servico) {
		if(this.servicos.contains(servico)) {
			this.servicos.remove(servico);
			return true;
		}
		return false;
	}

}
