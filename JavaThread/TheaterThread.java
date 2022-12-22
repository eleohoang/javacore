package JavaThread;

import java.awt.desktop.ScreenSleepEvent;

public class TheaterThread implements Runnable{

	String task;
	TheaterThread(String task) {
		this.task = task;
	}
	@Override
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println(task +": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		TheaterThread tt1 = new TheaterThread("Cut the ticket");
		TheaterThread tt2 = new TheaterThread("Show the seat number");
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		
		t1.start();
		t2.start();
	}
}
