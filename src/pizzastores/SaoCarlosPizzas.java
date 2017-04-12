package pizzastores;

import pizzas.*;

public class SaoCarlosPizzas implements PizzaStore{
	Pizza pizza;
	
	public Pizza order(String type) {
		if (type.equals("mussarela")){
			pizza = new Mussarela();
		} else if (type.equals("calabresa")){
			pizza = new Calabresa();
		} else if (type.equals("marguerita")){
			pizza = new Marguerita();
		} else if (type.equals("portuguesa")){
			pizza = new Portuguesa();
		}
	
		return pizza;
	}

	public String bake() {
		return "Assando a pizza de "+ pizza.getDescription() +"ao estilo São Carlense...";
	}

	public String cut() {
		return "Cortando a pizza de "+ pizza.getDescription() +"ao estilo São Carlense...";
	}

	public String box() {
		return "Embalando a pizza de "+ pizza.getDescription() +"ao estilo São Carlense...";
	}

}
