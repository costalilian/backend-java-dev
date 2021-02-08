
public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		  // pizza 1
		Pizza pizza_1 = new Pizza();
		pizza_1.adicionaIngrediente("peperoni");
		pizza_1.adicionaIngrediente("queijo");
		  
		  carrinho.adiciona(pizza_1);
		  
		  // pizza 2
		  Pizza pizza_2 = new Pizza();
		  pizza_2.adicionaIngrediente("manjericão");
		  pizza_2.adicionaIngrediente("queijo");
		  pizza_2.adicionaIngrediente("tomate");
		  
		  carrinho.adiciona(pizza_2);
		  
		  // pizza 3
		  Pizza pizza_3 = new Pizza();
		  pizza_3.adicionaIngrediente("ovo");
		  pizza_3.adicionaIngrediente("queijo");
		  pizza_3.adicionaIngrediente("tomate");
		  pizza_3.adicionaIngrediente("presunto");
		  pizza_3.adicionaIngrediente("pimentão");
		  pizza_3.adicionaIngrediente("oregano");
		  
		  carrinho.adiciona(pizza_3);
					  
		System.out.println("Total: " + carrinho.total());
		pizza_3.ingredientes();
	}

}
