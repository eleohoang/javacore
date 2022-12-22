package JavaThread;

public class NewThread extends Thread {
	public void run() {
		Thread nt = Thread.currentThread();
		System.out.println("new Thread = " + nt);
		System.out.println("New Thread start running");
		System.out.println("I am in run() method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread starts running");	
		Thread ct1 = Thread.currentThread();
		System.out.println("current main = " +ct1);

		int ac1 = Thread.activeCount();
		System.out.println("active main 1 = " +ac1);  

		// Create an object of NewThread class.
		NewThread nt = new NewThread();
		int ac2 = Thread.activeCount();
		System.out.println("active main 2 = " +ac2);

		// Create an object of Thread class and pass the object reference variable nt.
		Thread t = new Thread(nt);
		int ac3 = Thread.activeCount();
		System.out.println("active main 3 = " +ac3);

		// Now run thread on the object. For this, call start() method using reference variable t.
		t.start(); // This thread will execute statements inside run() method of NewThread object.
		int ac4 = Thread.activeCount();
		System.out.println("active main 4 = " +ac4);
		t.setName("NewThread"); // Setting a new name of thread.
	}

}
