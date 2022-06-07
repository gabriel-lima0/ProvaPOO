package model;
import java.util.ArrayList;
import java.util.List;

public class Setor implements Contador {
	private String descricaoSetor;
	private int codigoSetor;
	public int valor;
	public List<Pessoa> Pessoas = new ArrayList<>();
	
	//Construtor
	public Setor() {
		descricaoSetor = "nulo";
		codigoSetor = 000;
	}
		
	//Encapsulamento - descricao
	public String getDescricaoSetor() {
		return descricaoSetor;
	}
	public void setDescricaoSetor(String descricaoSetor) {
		this.descricaoSetor = descricaoSetor;
	}
	
	//Encapsulamento - codigo
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	//Contador
	@Override
	public void contar() {
		 valor = Pessoas.size();
	}
}
