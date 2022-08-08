package com.yedam.coffee;

public class Coffee {
	private String coffeeMenu;
	private int coffeePrice;
	private String coffeeExplain;
	private int coffeeSales;

	public String getCoffeeMenu() {
		return coffeeMenu;
	}

	public int getCoffeePrice() {
		return coffeePrice;
	}

	public String getCoffeeExplain() {
		return coffeeExplain;
	}

	public int getCoffeeSales() {
		return coffeeSales;
	}

	public void setCoffeeMenu(String coffeeMenu) {
		this.coffeeMenu = coffeeMenu;
	}

	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

	public void setCoffeeExplain(String coffeeExplain) {
		this.coffeeExplain = coffeeExplain;
	}

	public void setCoffeeSales(int coffeeSales) {
		this.coffeeSales = coffeeSales;
	}

}
