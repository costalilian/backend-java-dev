import java.util.HashMap;

public class Pizza {
	
	public static final HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	public int contabilizaIngredienteInt = 0;
	
	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente();
		
		ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
	}
	
	public int getPreco() {
		int preco = 23;
		
		if(contabilizaIngredienteInt <= 2) {
			preco = 15;
		} 
		else if (contabilizaIngredienteInt >= 3 && contabilizaIngredienteInt <= 5) {
			preco = 20;
		}
		
		return preco;
	}
	
	public int contabilizaIngrediente() {
		contabilizaIngredienteInt++;
		return contabilizaIngredienteInt;
	}
	
	public void ingredientes() {
		ingredientes.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
	}
}
