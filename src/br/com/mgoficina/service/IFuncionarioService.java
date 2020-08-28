package br.com.mgoficina.service;

import java.util.UUID;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;


public interface IFuncionarioService {
	public Funcionario create(Funcionario funcionario);
	public Funcionario findFuncionarioById (UUID funcionario) throws ObjectNotFoundException;
	public boolean updateFuncionario(Funcionario funcionario);
	public boolean deleteFuncionario(Funcionario funcionario);

}
