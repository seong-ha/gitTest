package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {
	private static CoffeeDAO cd = null;

	private CoffeeDAO() {

	}

	public static CoffeeDAO getInstance() {
		if (cd == null) {
			cd = new CoffeeDAO();
			return cd;
		}

		return cd;
	}

	public List<Coffee> getMenu() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;

		try {
			conn();
			String sql = "select * from coffee";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	public List<Coffee> getDetailMenu(String coffeeMenu) {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;

		try {
			conn();
			String sql = "select coffee_menu, coffee_price, coffee_explain"
					    + " from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	public int insertCoffee(Coffee coffee) {
		int result = 0;

		try {
			conn();
			String sql = "insert into coffee (coffee_menu, coffee_price, coffee_explain) values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	public int deleteCoffee(String coffeeMenu) {
		int result = 0;

		try {
			conn();
			String sql = "delete coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	public int salesCoffee(String coffeeMenu) {
		int result = 0;

		try {
			conn();
			String sql = "select coffee_sales from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			rs = pstmt.executeQuery();

			int sales = 0;
			while (rs.next()) {
				sales = rs.getInt("coffee_sales");
			}

			if (rs != null) { // 해당 메뉴가 있으면 판매
				String sql2 = "update coffee set coffee_sales = ? where coffee_menu = ?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1, ++sales);
				pstmt.setString(2, coffeeMenu);

				result = pstmt.executeUpdate();
			} else {
				System.out.println("없는 메뉴입니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

}
