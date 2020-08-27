package br.com.mgoficina;

import java.time.LocalDate;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.impl.ServicoServiceImpl;
import br.com.mgoficina.service.impl.VeiculosImpl;

public class Main {
	
	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo(null, null, null, null, null, null, null);
		VeiculosImpl veiculos = new VeiculosImpl();
		
		veiculos.create(veiculo1);
	}
}
