package com.yedam.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);

	public void getProduct() {
		List<Product> list = ProductDAO.getInstance().getProduct();

		for (Product product : list) {
			System.out.println("==========================");
			System.out.println("| 상품명) " + product.getProductName() + " |");
			System.out.println("| 상품가격) " + product.getProductPrice() + " |");
			System.out.println("==========================");
		}
	}

	public void getDetailProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();

		for (Product product : list) {
			System.out.println("***********************************");
			System.out.println("* 상품ID] " + product.getProductId() + " *");
			System.out.println("* 상품명] " + product.getProductName() + " *");
			System.out.println("* 상품가격] " + product.getProductPrice() + " *");
			System.out.println("* 상품설명] " + product.getProductExplain() + " *");
			System.out.println("* 판매량] " + product.getProductSales() + " *");
			System.out.println("* 진열점포] " + product.getStores() + " *");
			System.out.println("***********************************");
		}
	}

	public void getStoreProduct() {
		System.out.print("조회할 점포를 입력해주세요.> ");
		String stores = sc.nextLine();

		List<Product> list = ProductDAO.getInstance().getStoreProduct(stores);

		System.out.println(list.get(0).getStores() + " 지점의 상품들입니다.");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("---------------------------------------");
			System.out.println("* 상품ID] " + list.get(i).getProductId() + " *");
			System.out.println("* 상품명] " + list.get(i).getProductName() + " *");
			System.out.println("* 상품가격] " + list.get(i).getProductPrice() + " *");
			System.out.println("* 상품설명] " + list.get(i).getProductExplain() + " *");
			System.out.println("* 판매량] " + list.get(i).getProductSales() + " *");
			System.out.println("* 진열점포] " + list.get(i).getStores() + " *");
			System.out.println("---------------------------------------");
		}
	}

	public void insertProduct() {
		Product product = new Product();

		System.out.println("등록할 상품의 정보를 입력해주세요.");
		System.out.print("상품ID> ");
		String productId = sc.nextLine();
		System.out.print("상품명> ");
		String productName = sc.nextLine();
		System.out.print("상품가격> ");
		int productPrice = Integer.parseInt(sc.nextLine());
		System.out.print("상품설명> ");
		String productExplain = sc.nextLine();
		System.out.print("판매량> ");
		int productSales = Integer.parseInt(sc.nextLine());
		System.out.print("진열점포> ");
		String stores = sc.nextLine();

		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setProductExplain(productExplain);
		product.setProductSales(productSales);
		product.setStores(stores);

		int result = ProductDAO.getInstance().insertProduct(product);

		if (result == 1) {
			System.out.println("상품 등록 성공");
		} else {
			System.out.println("상품 등록 실패");
		}

	}

	public void deleteProduct() {
		System.out.print("삭제할 상품 ID를 입력하세요> ");
		String productId = sc.nextLine();

		int result = ProductDAO.getInstance().deleteProduct(productId);

		if (result == 1) {
			System.out.println("상품 삭제 성공");
		} else {
			System.out.println("상품 삭제 실패");
		}
	}

	public void calProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		int sum = 0;

		for (Product product : list) {
			System.out.println("#####################################");
			System.out.println("# 상품명] " + product.getProductName() + " #");
			System.out.println("# 상품 판매 개수] " + product.getProductSales() + " #");
			System.out.println("# 상품 판매 총액] " + product.getProductPrice() * product.getProductSales() + " #");
			System.out.println("# 진열점포] " + product.getStores() + " #");
			System.out.println("#####################################");
			
			sum += (product.getProductPrice() * product.getProductSales());
		}
		System.out.println("\n총 판매 금액> " + sum + "원 입니다.");

	}
}
