package JavaThread;

public class MyThread extends Thread {
	public void run() {
		System.out.println("New thread run!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main begin thread run!");
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("Main end thread run!");
		
		int a = 5;
		int b= 7;
		System.out.println("sum = "+a+b);
		System.out.println("sum = "+(a+b));
	}
}
