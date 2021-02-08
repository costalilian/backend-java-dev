
public class Principal {

	public static void main(String[] args) {
		IMC p1 = new IMC();
		p1.nome = "Pessoa 1";
		p1.altura = 1.63;
		p1.peso = 70.10;
		p1.imc = 0;
		
		IMC p2 = new IMC();
		p2.nome = "Pessoa 2";
		p2.altura = 1.73;
		p2.peso = 87.50;
		p2.imc = 0;
		
		IMC p3 = new IMC();
		p3.nome = "Pessoal Ideal";
		p3.altura = 1.63;
		p3.peso = 59.50;
		p3.imc = 0;

		p1.resultadoimc ();
		p2.resultadoimc ();
		p3.resultadoimc ();
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		
		p1.resultadoPessoa();
		p2.resultadoPessoa();
		p3.resultadoPessoa();
		
	}

}
