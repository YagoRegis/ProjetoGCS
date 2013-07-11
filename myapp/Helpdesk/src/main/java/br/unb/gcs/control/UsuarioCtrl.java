package main.java.br.unb.gcs.control;

import main.java.br.unb.gcs.dao.UsuarioDAO;
import main.java.br.unb.gcs.model.Usuario;

public class UsuarioCtrl {

	private static UsuarioCtrl instance;

	public void inserir(Usuario usuario){
		UsuarioDAO.getInstance().incluir(usuario);
	}

	public void alterar(Usuario usuario){
		UsuarioDAO.getInstance().alterar(usuario);
	}

	public void excluir(String login) {
		UsuarioDAO.getInstance().excluir(login);
	}

	public static UsuarioCtrl getInstance() {
		if(instance == null)
			instance = new UsuarioCtrl();
		return instance;
	}
}
