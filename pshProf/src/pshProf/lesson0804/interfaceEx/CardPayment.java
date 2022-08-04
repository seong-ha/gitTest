package pshProf.lesson0804.interfaceEx;

public class CardPayment implements Payment{
	public double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		double cardRatioPrice = price * cardRatio;
		double onlineRatioPrice = price * ONLINE_PAYMENT_RATIO;
		
		return (int) (price - (cardRatioPrice + onlineRatioPrice));
	}

	@Override
	public int offline(int price) {
		double cardRatioPrice = price * cardRatio;
		double offlineRatioPrice = price * ONLINE_PAYMENT_RATIO;
		
		return (int) (price - (cardRatioPrice + offlineRatioPrice));
	}

	@Override
	public void showInfo() {
		System.out.println("   < 카드결제 시 할인 정보 >");
		System.out.println("온라인 결제 시 총 할인율: " + (ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제 시 총 할인율: " + (OFFLINE_PAYMENT_RATIO + cardRatio));
	}
	
}
