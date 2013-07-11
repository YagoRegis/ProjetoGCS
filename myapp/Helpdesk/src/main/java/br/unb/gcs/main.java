package main.java.br.unb.gcs;

import main.java.br.unb.gcs.dao.ChamadoDAO;
import main.java.br.unb.gcs.dao.UsuarioDAO;
import main.java.br.unb.gcs.model.Chamado;
import main.java.br.unb.gcs.model.TipoChamado;
import main.java.br.unb.gcs.model.Usuario;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario("andrecruz", "654321", "andre", "andrelink14@hotmail.com", "090066626");
		//UsuarioDAO usuarioDAO;
		//usuarioDAO = UsuarioDAO.getInstance();
		//usuarioDAO.incluir(usuario);
		TipoChamado tipoChamado = new TipoChamado(2, "Instalações Elétrica");
		//usuarioDAO.excluir("andrecruz");
		//usuarioDAO.obterEspecifico("andre");
		
		Chamado chamado = new Chamado(1,"25-07-2013","25-07-2013", "Conserto de uma parede", usuario, usuario, tipoChamado, "forum", 123);
		ChamadoDAO chamadoDAO;
		chamadoDAO = ChamadoDAO.getInstance();
		chamadoDAO.incluir(chamado);
	}

}
