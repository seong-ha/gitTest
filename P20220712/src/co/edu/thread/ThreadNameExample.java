package co.edu.thread;

class ThreadA extends Thread {

	public ThreadA() {
		setName("Thread-A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명: " + getName());
		}
	}
	
}

class ThreadB extends Thread {

	public ThreadB() {
		setName("Thread-B");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명: " + getName());
		}
	}
	
}

public class ThreadNameExample {

	public static void main(String[] args) {
		
//		Thread mainThread = Thread.currentThread();
//		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		threadB.start();
	}

}
