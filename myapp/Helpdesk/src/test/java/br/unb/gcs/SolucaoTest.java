package test.java.br.unb.gcs;


import junit.framework.*;
import main.java.br.unb.gcs.model.Chamado;
import main.java.br.unb.gcs.model.Solucao;

public class SolucaoTest {

	@Test
	public void newSolucao() {
		
		String data = "21-09-2013";
		Chamado chamado = new Chamado();
		Solucao solucao = new Solucao(1,chamado,"Solucao um foi feita",data);
				
		assertNotNull(solucao);
		assertEquals(1, solucao.getId());
		assertEquals("Solucao um foi feita", solucao.getDescricao());
	}

}
