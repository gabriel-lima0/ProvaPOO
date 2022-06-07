package model;
import java.util.ArrayList;
import java.util.List;

public class Estrutura extends Departamento implements Contador {
	private String nomeEst;
	private int codigoEst;
	public int valor; 
	public List<Departamento> Departamentos = new ArrayList<>();
	
	//Construtor
	public Estrutura() {
		nomeEst = "nulo";
		codigoEst = 000;
	}
	
	//Encapsulamento - nome
	public String getNomeEst() {
		return nomeEst;
	}

	public void setNomeEst(String nomeEst) {
		this.nomeEst = nomeEst;
	}
	
	//Encapsulamento - codigo
	public int getCodigoEst() {
		return codigoEst;
	}
	public void setCodigoEst(int codigo) {
		this.codigoEst = codigo;
	}

	//Contador
	@Override
	public void contar() {
		 valor = Departamentos.size();
	}

}

