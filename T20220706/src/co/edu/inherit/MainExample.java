package co.edu.inherit;

public class MainExample {

	public static void main(String[] args) {
		DmbCellPhone dphone = new DmbCellPhone();
		dphone.setModel("AnyCall");
		dphone.setColor("White");
		
		dphone.powerOn();
		dphone.bell();
		dphone.sendVoice();
		dphone.receiveVoice();
		
		dphone.turnOnDmb();
		dphone.turnOffDmb();
		
		dphone.powerOff();
		
		System.out.println();
		System.out.println("--------------------------------");
		SmartPhone sphone = new SmartPhone();
		
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		CellPhone d2phone = new DmbCellPhone("iphone", "white", 7);
		CellPhone s2phone = new SmartPhone();
		
		d2phone.powerOn();
//		d2phone.turnOnDmb();  // 자식 기능 사용 불가
		d2phone.powerOff();
		
		DmbCellPhone d3phone = (DmbCellPhone) d2phone;  // 강제형변환
		d3phone.turnOnDmb();
		System.out.println(d3phone.toString());
	}

}
