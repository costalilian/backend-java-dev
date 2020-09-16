
public class Somador 

{

	String nome;
	int valorInstancia = 0;
	// A variavel de instancia quando somada permanece no escopo do seu objeto
	static int valorEstatica = 0;
	// A variavel estatica quando somada, se da para todos os 3 objetos
	void somar() 
	{
		valorInstancia++;
		valorEstatica++;
	}
	
	void imprimir()
	{
		System.out.println("O somador "+nome+": instancia="+valorInstancia+" e estatica="+valorEstatica+"");
	}
	
}
