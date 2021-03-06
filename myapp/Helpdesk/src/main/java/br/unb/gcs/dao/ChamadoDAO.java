package main.java.br.unb.gcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.br.unb.gcs.model.Chamado;

import main.java.br.unb.gcs.utils.ConnectionFactory;

public class ChamadoDAO {
	private static ChamadoDAO instance;
	private ChamadoDAO(){
	}
	public static ChamadoDAO getInstance(){
		if(instance == null)
			instance = new ChamadoDAO();
		return instance;
	}

	public void incluir(Chamado chamado){
		this.updateQuery("INSERT INTO " +
					"chamado (tipo_cod, usuario_login,descricao, data_inicial, data_final, " +
					"patrimonio_equip, localizacao_equip, login_tecnico) VALUES (" +
					"\"" + chamado.getTipoChamado().getId() + "\", " +
					"\"" + chamado.getSolicitante().getLogin() + "\", " +
					"\"" + chamado.getDescricao()+ "\" , " +
					"\"" + chamado.getDataInicial() + "\", " +
					"\"" + chamado.getDataFinal() + "\", " +
					"\"" + chamado.getPatrimonio() + "\", " +
					"\"" + chamado.getLocalEquipamento() + "\", " +				
					"\"" + chamado.getTecnico() + "\"); "
				);

	}
	
	public void obterEspecifico(long id){
		this.updateQuery("SELECT * FROM chamado WHERE cod = \""+id+"\";");
	}

	public void alterar(Chamado chamado) {			
		this.updateQuery("UPDATE chamado SET " +
				"tipo_cod = \"" + chamado.getTipoChamado().getId() + "\", " +
				"usuario_login = \"" + chamado.getSolicitante().getLogin() + "\", " +
				"data_inicial = \"" + chamado.getDataInicial() + "\", " +
				"data_final = \"" + chamado.getDataFinal() + "\", " +
				"patrimonio_equip = \"" + chamado.getPatrimonio() + "\", " +
				"localizacao_equip = \"" + chamado.getLocalEquipamento() + "\", " +		
				"login_tecnico = \"" + chamado.getTecnico().getLogin()  + "\""+
				" WHERE " +
				"cod = \"" + chamado.getId() + "\";"
				);
	}

	public void excluir(long id) {
		this.updateQuery("DELETE FROM chamado WHERE cod = \"" + id + "\";"
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
