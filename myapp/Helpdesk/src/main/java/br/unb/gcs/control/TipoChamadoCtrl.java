package main.java.br.unb.gcs.control;

import main.java.br.unb.gcs.model.TipoChamado;
import main.java.br.unb.gcs.dao.TipoChamadoDAO;

public class TipoChamadoCtrl {
	private static TipoChamadoCtrl instance;

	public void inserir(String descricao) {
		TipoChamadoDAO.getInstance().incluir(descricao);
	}

	public void alterar(TipoChamado tipoChamado) {
		TipoChamadoDAO.getInstance().alterar(tipoChamado);
	}

	public void excluir(long id) {
		TipoChamadoDAO.getInstance().excluir(id);
	}
	public static TipoChamadoCtrl getInstance() {
		if(instance == null)
			instance = new TipoChamadoCtrl();
		return instance;
	}
}
