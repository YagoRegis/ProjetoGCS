package test.java.br.unb.gcs;


import junit.framework.*;

import main.java.br.unb.gcs.utils.ConnectionFactory;

public class ConnectionTest {

	@Test
	public void test() {
		ConnectionFactory connectionfactory = new ConnectionFactory();		
		assertNotNull(connectionfactory.getConnection());
	}

}
