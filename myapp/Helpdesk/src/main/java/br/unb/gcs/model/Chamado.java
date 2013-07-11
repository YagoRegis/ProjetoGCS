package main.java.br.unb.gcs.model;


public class Chamado {

	private long id;
	private String dataInicial;
	private String dataFinal;
	private String descricao;
	private Usuario solicitante;
	private Usuario tecnico;
	private TipoChamado tipoChamado;
	private String localEquipamento;
	private int patrimonio;
	
	public Chamado(){		
	}
	
	public Chamado(long id, String dataInicial, String dataFinal,
			String descricao, Usuario solicitante, Usuario tecnico,
			TipoChamado tipoChamado, String localEquipamento, int patrimonio) {
		this.id = id;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.tecnico = tecnico;
		this.tipoChamado = tipoChamado;
		this.localEquipamento = localEquipamento;
		this.patrimonio = patrimonio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}
	public Usuario getTecnico() {
		return tecnico;
	}
	public void setTecnico(Usuario tecnico) {
		this.tecnico = tecnico;
	}
	public TipoChamado getTipoChamado() {
		return tipoChamado;
	}
	public void setTipoChamado(TipoChamado tipoChamado) {
		this.tipoChamado = tipoChamado;
	}
	public String getLocalEquipamento() {
		return localEquipamento;
	}
	public void setLocalEquipamento(String localEquipamento) {
		this.localEquipamento = localEquipamento;
	}
	public int getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}
	
	
	
}
