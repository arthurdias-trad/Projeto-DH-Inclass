package br.com.mgoficina.model;
import java.time.LocalDate;
import java.util.UUID;

public class Veiculo {
	
	private UUID placaDoVeiculo;
	private String modelo;
	private String cor;
	private LocalDate ano;
	private UUID chassi;
	private String tipoDeVeiculo;
	private Cliente cliente;
	
	public Veiculo(UUID placaDoVeiculo, String modelo, String cor, LocalDate ano, UUID chassi, String tipoDeVeiculo, Cliente cliente) {
		this.placaDoVeiculo = placaDoVeiculo;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.chassi = chassi;
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.cliente = cliente;
	}

	public UUID getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}

	public void setPlacaDoVeiculo(UUID placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public LocalDate getAno() {
		return ano;
	}

	public void setAno(LocalDate ano) {
		this.ano = ano;
	}

	public UUID getChassi() {
		return chassi;
	}

	public void setChassi(UUID chassi) {
		this.chassi = chassi;
	}

	public String getTipoDeVeiculo() {
		return tipoDeVeiculo;
	}

	public void setTipoDeVeiculo(String tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
}
