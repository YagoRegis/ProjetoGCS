package main.java.br.unb.gcs.control;

import main.java.br.unb.gcs.model.Status;
import main.java.br.unb.gcs.dao.StatusDAO;

public class StatusCtrl {
	private static StatusCtrl instance;

	public void inserir(String descricao) {
		StatusDAO.getInstance().incluir(descricao);
	}

	public void alterar(Status status) {
		StatusDAO.getInstance().alterar(status);
	}

	public void excluir(long id) {
		StatusDAO.getInstance().excluir(id);
	}

	public static StatusCtrl getInstance() {
		if(instance == null)
			instance = new StatusCtrl();
		return instance;
	}
}
