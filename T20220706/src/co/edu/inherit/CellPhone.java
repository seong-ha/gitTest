package co.edu.inherit;

public class CellPhone {
	private String model;
	private String color;
	
	public CellPhone() {}
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void powerOn() { System.out.println("전원을 켭니다."); }
	public void powerOff() { System.out.println("전원 끕니다."); }
	public void bell() { System.out.println("bell"); }
	public void sendVoice() { System.out.println("메세지 전송"); }
	public void receiveVoice() { System.out.println("메세지 수신"); }
	public void hangUp() { System.out.println("전화를 끊었습니다."); }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "model명은 " + model + ", 색상은 " + color + "색입니다.";
	}
	
	
}
