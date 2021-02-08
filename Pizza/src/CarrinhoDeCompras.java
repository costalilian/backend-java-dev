import java.util.HashMap;

public class CarrinhoDeCompras {
	
	public final HashMap<Pizza, Integer> pedido = new HashMap<Pizza, Integer>();
	public int total = 0;

	public void adiciona(Pizza pizza) {
		pedido.put(pizza, pizza.getPreco());
	}
	
	public int total() {
		pedido.forEach((k, v) -> {
			total += v;
		});
		
		return total;
	}
}
