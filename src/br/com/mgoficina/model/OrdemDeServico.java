package br.com.mgoficina.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class OrdemDeServico {
	
	private UUID idOrdemServico;
	private String nomeServico;
	private LocalDate inicioServico;
	private LocalDate fimServico;
	private Double valor;
	private String metodoDePagamento;
	private Cliente cliente;
	private Veiculo veiculo;
	
		
	public UUID getIdOrdemServico() {
		return idOrdemServico;
	}
	public void setIdOrdemServico(UUID idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public LocalDate getInicioServico() {
		return inicioServico;
	}
	public void setInicioServico(LocalDate inicioServico) {
		this.inicioServico = inicioServico;
	}
	public LocalDate getFimServico() {
		return fimServico;
	}
	public void setFimServico(LocalDate fimServico) {
		this.fimServico = fimServico;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}
	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public OrdemDeServico(UUID idOrdemServico, String nomeServico, LocalDate inicioServico, LocalDate fimServico,
			Double valor, String metodoDePagamento, Cliente cliente, Veiculo veiculo) {
		this.idOrdemServico = idOrdemServico;
		this.nomeServico = nomeServico;
		this.inicioServico = inicioServico;
		this.fimServico = fimServico;
		this.valor = valor;
		this.metodoDePagamento = metodoDePagamento;
		this.cliente = cliente;
		this.veiculo = veiculo;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemDeServico other = (OrdemDeServico) obj;
		if (idOrdemServico != other.idOrdemServico)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("\n             ID: " + this.getIdOrdemServico() + "\n");
		string.append("     Data de Início: " + this.getInicioServico() + "\n");
		string.append("        Data de Término: " + this.getFimServico() + "\n");
		string.append("          Valor: " + this.getValor() + "\n");
		string.append("MetodoPagamento: " + this.getMetodoDePagamento() + "\n");
		string.append("        Cliente: " + this.getCliente() + "\n");
		string.append("        Veículo: " + this.getVeiculo() + "\n");
		return string.toString();
	}
	
}
