package main.java.br.unb.gcs.control;

import main.java.br.unb.gcs.model.Solucao;
import main.java.br.unb.gcs.dao.SolucaoDAO;

public class SolucaoCtrl {
	private static SolucaoCtrl instance;

	public void inserir(Solucao solucao) {
		SolucaoDAO.getInstance().incluir(solucao);
	}

	public void alterar(Solucao solucao) {
		SolucaoDAO.getInstance().alterar(solucao);
	}

	public void excluir(long id) {
		SolucaoDAO.getInstance().excluir(id);
	}

	public static SolucaoCtrl getInstance() {
		if(instance == null)
			instance = new SolucaoCtrl();
		return instance;
	}
}
