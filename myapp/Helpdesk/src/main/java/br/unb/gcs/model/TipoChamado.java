package main.java.br.unb.gcs.model;

public class TipoChamado {
	private int id;
	private String descricao;	
	
	public TipoChamado(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
