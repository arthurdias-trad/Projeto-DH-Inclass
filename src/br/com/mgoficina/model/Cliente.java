package br.com.mgoficina.model;

import java.util.ArrayList;
import java.util.UUID;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private UUID idDoCliente;
	private ArrayList<Veiculo> veiculos;
	
	public Cliente(String nome, String cpf, int idade, char sexo, ArrayList<Veiculo> veiculos) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.veiculos = veiculos;
		this.idDoCliente = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public UUID getIdDoCliente() {
		return idDoCliente;
	}
	
	public void setIdDoCliente(UUID idDoCliente) {
		this.idDoCliente = idDoCliente;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Cliente) || obj == null) {
			return false;
		}
		
		Cliente cliente = (Cliente) obj;
		UUID idDoObjeto = cliente.idDoCliente;
		
		return idDoCliente.equals(idDoObjeto);
	}	
	
}
