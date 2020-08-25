package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.service.IFuncionarioService;

public class FuncionarioServiceImpl implements IFuncionarioService {

	private List<Funcionario> funcionarios;
	public FuncionarioServiceImpl() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	@Override
	public Funcionario create(Funcionario funcionario) {
		funcionario.setIdDoFuncionario(UUID.randomUUID());
		this.funcionarios.add(funcionario);
		return funcionario;
	}

	@Override
	public Funcionario findFuncionarioById(UUID idFuncionario) {
		for (Funcionario funcionario: this.funcionarios) {
			if (funcionario.getIdDoFuncionario().equals(idFuncionario)) {
				return funcionario;
			}
		}
		return null;
	}

	@Override
	public boolean updateFuncionario(Funcionario funcionario) {
		if (this.funcionarios.contains(funcionario)) {
			int indice = this.funcionarios.indexOf(funcionario);
			this.funcionarios.remove(funcionario);
			this.funcionarios.add(indice, funcionario);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteFuncionario(Funcionario funcionario) {
		if (this.funcionarios.contains(funcionario)) {
			this.funcionarios.remove(funcionario);
			return true;
		} else {
			return false;
		}
	}
	
	

}
