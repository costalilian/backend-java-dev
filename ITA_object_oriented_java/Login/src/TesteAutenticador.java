import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());
	}
	
//	@Test(expected = LoginException.class) 
//	void loginFalho() throws LoginException {
//		Autenticador a = new Autenticador();
//		Usuario u = a.logar("guerra", "senhaerradadoguerra");
//	}

	@Test 
	void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhaerradadoguerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
		
	}
}
