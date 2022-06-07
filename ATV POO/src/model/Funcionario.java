package model;

public class Funcionario extends Pessoa{
	private String profissao;
	private String cargaHoraria;
	private int codigoFunc;
	private double salarioFunc;
	
	//Construtor
	public Funcionario() {
		profissao = "nulo";
		cargaHoraria = "nulo";
		codigoFunc = 000;
		salarioFunc = 000;
	}
	
	//Encapsulamento - profissao
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	//Encapsulamento - cargaHoraria
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	//Encapsulamento - codigo
	public int getCodigoFunc() {
		return codigoFunc;
	}
	public void setCodigoFunc(int codigoFunc) {
		this.codigoFunc = codigoFunc;
	}
	
	//Encapsulamento - salario
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

}
