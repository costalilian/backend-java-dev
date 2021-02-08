import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {

	@Before
	public void inicializaConta(){
		ContaEspecial cc = new ContaEspecial(50);
		cc.depositar(200);
	}
	
	@Test
	void sacarMaiorSaldo() {
		ContaEspecial cc = new ContaEspecial(50);
		cc.depositar(200);
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}
	
	@Test
	void sacarMaiorSaldoDentroDoLimite() {
		ContaEspecial cc = new ContaEspecial(50);
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(valorSacado, 250);
	}

}
