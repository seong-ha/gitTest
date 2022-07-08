package co.edu.inherit;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone() {
		super();
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("DMB화면 ON");
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB화면 OFF");
	}

	@Override
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 " + getColor() + ", 채널은 " + channel + "입니다.";
	}
	
	
}