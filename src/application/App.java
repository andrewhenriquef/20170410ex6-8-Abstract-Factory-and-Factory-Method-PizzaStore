package application;

import pizzastores.PizzaStore;
import pizzastores.SaoCarlosPizzas;

public class App {

	public static void main(String[] args) {

		PizzaStore saocarlos = new SaoCarlosPizzas();
		
		saocarlos.order("calabresa");
		showData(saocarlos);
		
		saocarlos.order("mussarela");
		showData(saocarlos);
		
		saocarlos.order("marguerita");
		showData(saocarlos);
		
		saocarlos.order("portuguesa");
		showData(saocarlos);
	}

	public static void showData(PizzaStore pizzaria){
		System.out.println("----------------------->");
		System.out.println(pizzaria.bake() + "\n" + pizzaria.cut() + "\n" + pizzaria.box());
		
	}
}
