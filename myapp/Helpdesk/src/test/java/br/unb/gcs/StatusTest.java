package test.java.br.unb.gcs;


import junit.framework.*;

import main.java.br.unb.gcs.model.Status;

public class StatusTest {
	@Test
	public void newStatus() {		
		Status status = new Status(1,"Fechado");
				
		assertNotNull(status);
		assertEquals(1, status.getId());
		assertEquals("Fechado", status.getNome());

	}
}
