package br.com.mgoficina.service;

import java.util.UUID;

import br.com.mgoficina.model.Funcionario;


public interface IFuncionarioService {
	public Funcionario create(Funcionario funcionario);
	
	public Funcionario findFuncionarioById (UUID funcionario);
	
	public boolean updateFuncionario(Funcionario funcionario);
	public boolean deleteFuncionario(Funcionario funcionario);

}
