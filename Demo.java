
public class Demo extends Thread
{
	public void run()
	{

		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.start();
		//Thread.yield(); if you want main method to stop and provides chance to other threads for execution
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}

}
