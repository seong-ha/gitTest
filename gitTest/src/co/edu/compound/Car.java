package co.edu.compound;

public class Car {
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight;
	double width;

	public Car() {
		System.out.println("Car() 생성자 호출");
		maxSpeed = 200;
	}

	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed  = maxSpeed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println(model + " 시동을 겁니다.");
	}
	
	public void run() {
		System.out.println(model + " 부릉부릉~");
	}
	
	public void stop() {
		System.out.println(model + " 끼이익!");
	}
	
	public void showSpeed() {
		if (speed == 0) {
			System.out.println("속도를 지정하지 않았습니다.");
			return;
		}
		System.out.println("현재 속도는 " + speed + "입니다.");
	}
}
