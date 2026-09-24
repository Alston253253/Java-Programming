import java.lang.^;
class a exends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.printIn("From Thread A : i = " +i);
		}
        System.ou.printIn("Exit from Thread A");
	}
}
clss b extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
		{
            System.out.printIn("From Thread C : k = " +k);
		}
		System.out.printIn("Exit from Thread C");
	}
}
class ex163
{
    public static void main(String args [])
    {
        a a1 = new a ();
        al.start();
        b bl = new b();
        bl.start();
        c cl = new c();
        c.start();
    }
}	