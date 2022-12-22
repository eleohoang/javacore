package JavaThread;

class X {
	void display1(X obj2) {
		System.out.println("Thread1 waiting for thread2 to release lock");
		synchronized(obj2) {
			System.out.println("Deadlock occurred"); 
		}
	}
	void display2(X obj1) {
		System.out.println("Thread2 waiting for thread1 to release lock");
		synchronized(obj1){
			System.out.println("Deadlock occurred"); 
		}
	} 
}
class Thread11 extends Thread {
	X obj1, obj2;
	Thread11(X obj1, X obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run()
	{
		synchronized(obj1){
			try {
				Thread.sleep(1000);  
			}
			catch(InterruptedException ie) {
				System.out.println(ie);	
			}
			obj2.display2(obj2);  
		}
	}
}
class Thread12 extends Thread 
{
	X obj1, obj2;
	Thread12(X obj1, X obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run()
	{
		synchronized(obj2){
			try {
				Thread.sleep(1000);  
			}
			catch(InterruptedException ie) {
				System.out.println(ie);	
			}
			obj1.display1(obj1);
		}
	}
}
public class Deadlock {
	public static void main(String[] args) 
	{
		X obj1 = new X();
		X obj2 = new X();

		Thread11 t1 = new Thread11(obj1, obj2);
		Thread12 t2 = new Thread12(obj1, obj2);
		t1.start();
		t2.start();
	}
}
