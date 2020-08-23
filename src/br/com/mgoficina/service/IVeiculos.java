package br.com.mgoficina.service;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculos {
	
	public void cadastrarVeiculo(Veiculo veiculo);	
	
	public String infoVeiculo (Veiculo veiculo);
	
	public void atualizarCadastroVeiculo (Veiculo veiculo);
	
	public void removerCadastroVeiculo (Veiculo veiculo);
	
	
}
