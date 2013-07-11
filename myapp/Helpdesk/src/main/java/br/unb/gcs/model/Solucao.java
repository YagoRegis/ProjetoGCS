package main.java.br.unb.gcs.model;


public class Solucao {

	private int id;
	private Chamado chamado;
	private String descricao;
	private String data;
	
	public Solucao(int id, Chamado chamado, String descricao, String data) {
		this.id = id;
		this.setChamado(chamado);
		this.descricao = descricao;
		this.data = data;
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Chamado getChamado() {
		return chamado;
	}
	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	
	
}
