package br.com.mgoficina.model;

import java.util.List;
import java.util.UUID;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private String cargo;
	private UUID idDoFuncionario;
	private List<Servico> servicos;
	
	public Funcionario(String nome, String cpf, int idade, char sexo, String cargo, UUID idDoFuncionario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.cargo = cargo;
		this.idDoFuncionario = idDoFuncionario;
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

	public UUID getIdDoFuncionario() {
		return idDoFuncionario;
	}

	public void setIdDoFuncionario(UUID idDoFuncionario) {
		this.idDoFuncionario = idDoFuncionario;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Funcionario)) {
			return false;
		}
		
		Funcionario other = (Funcionario) obj;
		
		return this.idDoFuncionario.equals(other.idDoFuncionario);
	}
	
	
	
}
