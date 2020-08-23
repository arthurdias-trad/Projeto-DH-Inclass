package br.com.mgoficina.model;
import java.time.LocalDate;
import java.util.UUID;
import br.com.mgoficina.model.Cliente;

public class Veiculo {
	
	private String placaDoVeiculo;
	private String modelo;
	private String cor;
	private LocalDate ano;
	private String chassi;
	private String tipoDeVeiculo;
	private Cliente proprietario;
	
	
	public Veiculo(String placaDoVeiculo, String modelo, String cor, LocalDate ano, String chassi, String tipoDeVeiculo, Cliente proprietario) {
		this.placaDoVeiculo = placaDoVeiculo;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.chassi = chassi;
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.proprietario = proprietario;
	}

	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}

	public void setPlacaDoVeiculo(String placaDoVeiculo) {
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

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getTipoDeVeiculo() {
		return tipoDeVeiculo;
	}

	public void setTipoDeVeiculo(String tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Veiculo)) {
			return false;
		}
		
		Veiculo other = (Veiculo) obj;
		
		return other.chassi.equals(this.chassi);
	}
	
	
}
