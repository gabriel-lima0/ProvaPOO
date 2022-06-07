package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends Setor implements Contador  {
	private String descricao;
	private int codigo;
	public int valor;
	public List<Setor> Setores = new ArrayList<>();
	
	//Construtor
	public Departamento() {
		descricao = "nao informado";
		codigo = 000;
	}
	
	//Encapsulamento - descrição
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Encapsulamento - codigo
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//Contador
	@Override
	public void contar() {
		 this.valor = Setores.size();
	}
}