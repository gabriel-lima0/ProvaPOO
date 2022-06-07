package model;

public class Empresa {
	private String nome;
	private String endereco;
	private String cnpj;
	private Estrutura estrut;
	
	//Construtor
	public Empresa() {
		nome = "nulo";
		endereco = "nulo";
		cnpj = "nulo";
	}
	
	//Encapsulamento - nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Encapsulamento - endereco
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//Encapsulamento - cnpj
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Estrutura getEstrut() {
		return estrut;
	}

	public void setEstrut(Estrutura estrut) {
		this.estrut = estrut;
	}
}
