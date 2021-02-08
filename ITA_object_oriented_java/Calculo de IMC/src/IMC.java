
public class IMC {
	double peso;
	double altura;
	String nome;
	double imc;
		
	void resultadoimc() {
		imc = peso / (altura * altura);	
	}
		
	void resultadoPessoa() {
		if (imc < 16) {
			System.out.println("A "+nome+" est� com Baixo peso muito grave");	
		}
		else if ((imc >= 16) && (imc < 16.99)) {
			System.out.println("A "+nome+" est� com Baixo peso grave");				
		}
		else if ((imc >= 17) && (imc < 18.49)) {
			System.out.println("A "+nome+" est� com Baixo peso");
		}
		else if ((imc >= 18.50) && (imc < 24.49)) {
			System.out.println("A "+nome+" est� com Peso Normal");
		}
		else if ((imc >= 25) && (imc < 29.99)) {
			System.out.println("A "+nome+" est� com Sobrepeso");
		}
		else if ((imc >= 30) && (imc < 34.99)) {
			System.out.println("A "+nome+" est� com Obesidade Grau I");
		}
		else if ((imc >= 35) && (imc < 39.99)) {
			System.out.println("A "+nome+" est� com Obesidade Grau II");
		}
		else if (imc >= 40) {
			System.out.println("A "+nome+" est� com Obesidade Morbida");
		}
		else {
			
		}
		
	}
	
	double getValorimc() {
		return imc;
	}

	void imprimir() {
		System.out.println("O IMC de "+nome+" � "+getValorimc()+" kg/m2");
	}

}