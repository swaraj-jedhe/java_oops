package polymorphism;

public class demo {

	void disp()
	{
		System.out.println("running disp");
	}
	void disp(int arg)
	{
		System.out.println("running disp (int)");
		System.out.println(arg);
	}
	void disp(double arg)
	{
		System.out.println("running disp(float)");
		System.out.println(arg);
	}
	void disp(int arg, double arg1)
	{
		System.out.println("running disp (int , float)");
		System.out.println(+arg);
		System.out.println(+arg1);
	}
}
