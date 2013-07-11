package test.java.br.unb.gcs;

import static junit.framework.*;

import main.java.br.unb.gcs.model.TipoChamado;


public class TipoChamadoTest {

	@Test
	public void newTipo_chamado(){
		TipoChamado tipo_chamado = new TipoChamado(1,"Tipo chamado Teste");		
		
		assertNotNull(tipo_chamado);
		assertEquals(1, tipo_chamado.getId());
		assertEquals("Tipo chamado Teste", tipo_chamado.getDescricao());

	}

}
