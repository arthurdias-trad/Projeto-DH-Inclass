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
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public OrdemDeServico(UUID idOrdemServico, String nomeServico, LocalDate inicioServico, LocalDate fimServico,
			Double valor, String metodoDePagamento, Cliente cliente) {
		this.idOrdemServico = idOrdemServico;
		this.nomeServico = nomeServico;
		this.inicioServico = inicioServico;
		this.fimServico = fimServico;
		this.valor = valor;
		this.metodoDePagamento = metodoDePagamento;
		this.cliente = cliente;
	}
	
	
	
	

}
