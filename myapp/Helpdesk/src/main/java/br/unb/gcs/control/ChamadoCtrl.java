package main.java.br.unb.gcs.control;

import main.java.br.unb.gcs.model.Chamado;
import main.java.br.unb.gcs.dao.ChamadoDAO;

public class ChamadoCtrl {
	private static ChamadoCtrl instance;

	public void inserir(Chamado chamado) {
		ChamadoDAO.getInstance().incluir(chamado);
	}

	public void alterar(Chamado chamado) {
		ChamadoDAO.getInstance().alterar(chamado);
	}

	public void excluir(long id) {
		ChamadoDAO.getInstance().excluir(id);
	}

	public static ChamadoCtrl getInstance() {
		if(instance == null)
			instance = new ChamadoCtrl();
		return instance;
	}
}
