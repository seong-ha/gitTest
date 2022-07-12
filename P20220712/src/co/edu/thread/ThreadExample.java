package co.edu.thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread beep = new Thread(new BeepTask());
		BeepWorkerThread print = new BeepWorkerThread();
		beep.start();		
		print.start();
	}

}
