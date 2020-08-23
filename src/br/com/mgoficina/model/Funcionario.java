package br.com.mgoficina.model;

import java.util.UUID;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private String cargo;
	private UUID idDoCliente;
	
	public Funcionario(String nome, String cpf, int idade, char sexo, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.cargo = cargo;
		this.idDoCliente = UUID.randomUUID();
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
