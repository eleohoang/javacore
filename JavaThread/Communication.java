package JavaThread;

//In this program, we will understand how to use wait and notify.
//It is the most efficient way for thread communication.
class A1
{
	int i;	
	boolean flag = false; // flag will be true when data production is over.
	synchronized void deliver(int i)
	{
		if(flag)
			try
		{
				wait(); // Wait till a notification is received from Thread222. There will be no wastage of time.	 
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);	 
		}
		this.i = i;	
		flag = true; // When data production is over, it will store true into flag.
		System.out.println("Data Delivered: " +i);
		notify(); // When data production is over, it will notify Thread222 to use it.
	}
	synchronized int receive()
	{
		if(!flag)
			try {
				wait(); // Wait till a notification is received from Thread111.	
			}
		catch(InterruptedException ie){
			System.out.println(ie);	
		}
		System.out.println("Data Received: " + i); 
		flag = false; // It will store false into flag when data is received.
		notify(); // When data received is over, it will notify Thread111 to produce next data.
		return i;
	}
}
class Thread111 extends Thread
{
	A1 obj;
	Thread111(A1 obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int j = 1; j <= 5; j++){
			obj.deliver(j); 	
		}
	}}
class Thread222 extends Thread 
{
	A1 obj;
	Thread222(A1 obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int k = 0; k <= 5; k++){
			obj.receive();	
		}
	}}
public class Communication 
{
	public static void main(String[] args) 
	{
		A1 obj = new A1(); // Creating an object of class A.

		//Creating two thread objects and pass reference variable obj as parameter to Thread111 and Thread222.
		Thread111 t1 = new Thread111(obj);
		Thread222 t2 = new Thread222(obj);
		//Run both threads.
		t1.start();
		t2.start();
	}
}
