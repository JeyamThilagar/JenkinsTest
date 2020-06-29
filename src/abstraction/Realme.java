package abstraction;
interface Nokia
{
	void call();
	void message();
}

interface Honor
{
	void call();
	void message();
	void camera();
}

public class Realme implements Nokia,Honor
{
	public void call()
	{
		System.out.println("Call Function is working");
	}
	public void message()
	{
		System.out.println("Message function is working");
	}
	public void camera()
	{
		System.out.println("Camera is working");
	}
	void fingerprint()
	{
		System.out.println("Fingerprint is working");
	}
public static void main(String[] args) {
	Realme real=new Realme();
	real.call();
	real.message();
	real.camera();
	real.fingerprint();
	Honor hon=new Realme();
	hon.call();
	hon.message();
	hon.camera();
}
}