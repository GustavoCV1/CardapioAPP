package br.com.cardapio.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CardapioTO {
	
	private int codigo;
	private String nome;
	private String ingredientes;
	private String periodo;
	
	
	
	public CardapioTO() {
	}
	
	
	public CardapioTO(int codigo, String nome, String ingredientes, String periodo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.periodo = periodo;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int id) {
		this.codigo = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
	

}
