package pshProf.lesson0804.interfaceEx;

public class ExeApp {

	public static void main(String[] args) {
		int price = 10000;
		Payment simplePay = new SimplePayment(0.05);
		simplePay.showInfo();
		System.out.println("온라인 결제금액: " + simplePay.online(price));
		System.out.println("오프라인 결제금액: " + simplePay.offline(price));
		
		System.out.println("--------------------------------------");
		CardPayment cardPay = new CardPayment(0.02);
		cardPay.showInfo();
		System.out.println("온라인 결제 금액: " + cardPay.online(price));
		System.out.println("오프라인 결제 금액: " + cardPay.offline(price));
	}
}
