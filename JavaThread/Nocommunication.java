package JavaThread;

class A 
{
	int i;	
	synchronized void deliver(int i)
	{
		this.i = i;	 
		System.out.println("Data Delivered: " +i);	 
	}
	synchronized int receive()
	{
		System.out.println("Data Received: " + i); 
		return i;
	}
}
class Threadi1 extends Thread
{
	A obj;
	Threadi1(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int j = 1; j <= 5; j++){
			obj.deliver(j); 	
		}
	}
}
class Threadi2 extends Thread 
{
	A obj;
	Threadi2(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int k = 0; k <= 5; k++){
			obj.receive();	
		}
	}
}
public class Nocommunication 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		Threadi1 t1 = new Threadi1(obj);
		Threadi2 t2 = new Threadi2(obj);
		t1.start();
		t2.start();
	}
}
