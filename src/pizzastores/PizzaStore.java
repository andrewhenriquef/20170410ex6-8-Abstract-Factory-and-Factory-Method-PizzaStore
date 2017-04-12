package pizzastores;

import pizzas.Pizza;

public interface PizzaStore {
	
	public abstract Pizza order(String type);
	public abstract String bake();
	public abstract String cut();
	public abstract String box();

}
