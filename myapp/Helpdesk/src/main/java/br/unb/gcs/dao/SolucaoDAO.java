package main.java.br.unb.gcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.br.unb.gcs.model.Solucao;
import main.java.br.unb.gcs.utils.ConnectionFactory;

public class SolucaoDAO {
	private static SolucaoDAO instance;
	private SolucaoDAO(){
	}
	public static SolucaoDAO getInstance(){
		if(instance == null)
			instance = new SolucaoDAO();
		return instance;
	}

	public void incluir(Solucao solucao) {
		this.updateQuery("INSERT INTO " +
					"solucao (chamado_cod, descricao, data_solucao) VALUES (" +
					"\"" + solucao.getChamado().getId() + "\", " +
					"\"" + solucao.getDescricao()+ "\", " +
					"\"" + solucao.getData() + "\"); "
				);

	}

	public void obterEspecifico(String descricao) {
		this.updateQuery("SELECT * FROM solucao WHERE descricao =\""+descricao+"\";");
	}

	public void alterar(Solucao solucao)  {			
		this.updateQuery("UPDATE solucao SET " +
				"chamado_cod = \"" + solucao.getChamado().getId() + "\", " +
				"descricao = \"" + solucao.getDescricao()+ "\", " +
				"data_solucao = \"" + solucao.getData() + "\""+
				" WHERE " +
				"cod = \"" + solucao.getId() + "\";"
				);
	}

	public void excluir(long id)  {
		this.updateQuery("DELETE FROM solucao WHERE " +
				"cod = \"" + id + "\";"
				);
	}

	public void updateQuery(String message) {
		Connection connection =  ConnectionFactory.getConnection();		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(message);
			preparedStatement.execute();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}
