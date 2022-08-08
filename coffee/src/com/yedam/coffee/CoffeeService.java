package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);
	
	public void getMenu() {
		List<Coffee> list = CoffeeDAO.getInstance().getMenu();
		
		for (Coffee coffee : list) {
			System.out.println("메뉴: " + coffee.getCoffeeMenu()
						   + ", 가격: " + coffee.getCoffeePrice());
		}
	}
	
	public void getDetailMenu() {
		System.out.println("메뉴 입력>");
		String coffeeMenu = sc.nextLine();
		
		List<Coffee> list = CoffeeDAO.getInstance().getDetailMenu(coffeeMenu);
		
		for (Coffee coffee : list) {
			System.out.println("메뉴: " + coffee.getCoffeeMenu()
						   + ", 가격: " + coffee.getCoffeePrice()
					 	  + ",\t설명: " + coffee.getCoffeeExplain());
		}
	}
	
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		
		System.out.println("메뉴입력>");
		String coffeeMenu = sc.nextLine();
		
		System.out.println("가격입력>");
		int coffeePrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("설명입력>");
		String coffeeExplain = sc.nextLine();
		
		coffee.setCoffeeMenu(coffeeMenu);
		coffee.setCoffeePrice(coffeePrice);
		coffee.setCoffeeExplain(coffeeExplain);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		
		if (result == 1) {
			System.out.println("메뉴 등록 완료");
		} else {
			System.out.println("메뉴 등록 실패");
		}
		
	}
	
	public void deleteCoffee() {
		System.out.println("메뉴입력>");
		String coffeeMenu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().deleteCoffee(coffeeMenu);
		
		if (result == 1) {
			System.out.println("메뉴 삭제 완료");
		} else {
			System.out.println("메뉴 삭제 실패");
		}
	}
	
	public void salesCoffee() {
		System.out.println("메뉴입력>");
		String coffeeMenu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().salesCoffee(coffeeMenu);
		
		if (result == 1) {
			System.out.println("판매 완료");
		} else {
			System.out.println("판매 실패");
		}
	}
	
	public void calCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getMenu();
		
		int sum = 0;
		for (Coffee coffee : list) {
			System.out.println("메뉴: " + coffee.getCoffeeMenu()
			           + ", 판매 개수: " + coffee.getCoffeeSales()
			           + ", 판매 금액: " + (coffee.getCoffeePrice() * coffee.getCoffeeSales()));
			sum += (coffee.getCoffeePrice() * coffee.getCoffeeSales());
		}
		System.out.println("총 매출액: " + sum + "원");
	}
}
