package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String cpf;
	private String nomePes;
	private String dataNascimento;

	public List<Funcionario> Funcionarios = new ArrayList<>();

	//Construtor
	public Pessoa() {
		cpf = "nulo";
		nomePes = "nulo";
		dataNascimento = "nulo";
	}
	
	//Encapsulamento - cpf
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//Encapsulamento - nomePes
	public String getNomePes() {
		return nomePes;
	}
	public void setNomePes(String nomePes) {
		this.nomePes = nomePes;
	}

	//Encapsulamento - dataNascimento
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
