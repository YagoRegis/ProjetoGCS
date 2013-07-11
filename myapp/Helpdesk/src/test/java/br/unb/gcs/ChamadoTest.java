package test.java.br.unb.gcs;

import main.java.br.unb.gcs.model.Chamado;
import main.java.br.unb.gcs.model.Solucao;
import main.java.br.unb.gcs.model.Status;
import main.java.br.unb.gcs.model.TipoChamado;
import main.java.br.unb.gcs.model.Usuario;

import junit.framework.*;

public class ChamadoTest {

	@Test
	public void test() {
		

		Chamado chamado = new Chamado();
		Usuario solicitante = new Usuario("lmatos","102030","Luiz","luiz@gmail.com","0900300");
		Usuario tecnico = new Usuario("pchaves","123456","Pedro","luiz@gmail.com","0101101");
		Status status = new Status(1,"Fechado");
		Solucao solucao = new Solucao(1,chamado,"Reparo no monitor","25-08-2013");
		TipoChamado tipochamado = new TipoChamado(1,"Tipo Chamado");
		
		chamado.setId(1);
		chamado.setDataInicial("25-07-2013");
		chamado.setDataFinal("24-08-2013");
		chamado.setDescricao("Chamado Test");
		chamado.setSolicitante(solicitante);
		chamado.setTecnico(tecnico);
		chamado.setTipoChamado(tipochamado);
		chamado.setLocalEquipamento("FGA LAB-I6");
		chamado.setPatrimonio(2939934);
		
		
	}

}
