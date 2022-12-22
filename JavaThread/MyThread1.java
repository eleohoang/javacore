package JavaThread;

public class MyThread1 implements Runnable{
	public void run() {
		System.out.println("New thread running ");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);  
		}
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread running");	 

		// Create an object of MyThread class.	 
		MyThread1 th = new MyThread1();

		// Create an object of Thread class and pass reference variable th to Thread class constructor.   
		Thread t = new Thread(th);

		t.start(); // This thread will execute statements inside run() method of MyThread object.
	}
}
