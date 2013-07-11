package main.java.br.unb.gcs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.br.unb.gcs.model.Usuario;

import main.java.br.unb.gcs.utils.ConnectionFactory;

public class UsuarioDAO {
	
	private static UsuarioDAO instance;
	private UsuarioDAO(){
	}
	public static UsuarioDAO getInstance(){
		if(instance == null)
			instance = new UsuarioDAO();
		return instance;
	}

	public void incluir(Usuario usuario){
		this.updateQuery("INSERT INTO usuario (login, senha, email, nome, matricula) VALUES (" +
					"\"" + usuario.getLogin() + "\", " +
					"\"" + usuario.getSenha()+ "\", " +
					"\"" + usuario.getEmail() + "\", " +
					"\"" + usuario.getNome() + "\", " +
					"\"" + usuario.getMatricula() + "\"); "
				);

	}
	
	public void obterEspecifico(String nome){
		this.updateQuery("SELECT * FROM usuario WHERE nome =\""+nome+"\";");
	}

	public void alterar(Usuario usuario) {			
		this.updateQuery("UPDATE usuario SET " +
				"login = \"" + usuario.getLogin() + "\", " +
				"senha = \"" + usuario.getSenha() + "\", " +
				"email = \"" + usuario.getEmail() + "\", " +
				"nome = \"" + usuario.getNome() + "\", " +
				"matricula = \"" + usuario.getMatricula() + "\""+
				" WHERE " +
				"login = \"" + usuario.getLogin() + "\";"
				);
	}

	public void excluir(String login) {
		this.updateQuery("DELETE FROM usuario WHERE " +
				"login = \"" + login + "\";"
				);
	}

	public void updateQuery(String message){
		Connection connection =  ConnectionFactory.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(message);
			preparedStatement.execute();		
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
