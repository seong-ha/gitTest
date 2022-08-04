package pshProf.lesson0804.interfaceEx;

public class SimplePayment implements Payment {
	public double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		// simplePaymentRatio할인 + ONLINE_PAYMENT_RATIO 할인
		double simpleRatioPrice = price * simplePaymentRatio;
		double onlineRatioPrice = price * ONLINE_PAYMENT_RATIO;
		
		return (int) (price - (simpleRatioPrice + onlineRatioPrice));
	}

	@Override
	public int offline(int price) {
		// // simplePaymentRatio할인 + OFFLINE_PAYMENT_RATIO 할인
		double simpleRatioPrice = price * simplePaymentRatio;
		double offlineRatioPrice = price * OFFLINE_PAYMENT_RATIO;
		
		return (int) (price - (simpleRatioPrice + offlineRatioPrice));
	}

	@Override
	public void showInfo() {
		System.out.println("   < 간편결제 시 할인 정보 >");
		System.out.println("온라인 결제 시 총 할인율: " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율: " + (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
	}

}
