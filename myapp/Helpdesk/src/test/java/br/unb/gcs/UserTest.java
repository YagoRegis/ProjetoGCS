package test.java.br.unb.gcs;

import static junit.framework.*;

import main.java.br.unb.gcs.model.Usuario;

public class UserTest {
	
	@Test
	public void newUser() {
		Usuario usuario = new Usuario("lmatos","102030","Teste 123","teste@gmail.com","09/0000001");	
		
		assertNotNull(usuario);
		assertEquals("lmatos", usuario.getLogin());
		assertEquals("102030", usuario.getSenha());
		assertEquals("Teste 123", usuario.getNome());
		assertEquals("teste@gmail.com", usuario.getEmail());
		assertEquals("09/0000001", usuario.getMatricula());
	}

}
