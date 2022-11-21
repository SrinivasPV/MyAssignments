package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);

	}
	
	public void add(int a, int b,int c) {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);

	}
	
	public void sub(double a, double b) {
		// TODO Auto-generated method stub

		System.out.println(a-b);
	}
	
	public void sub(int a, int b) {
		// TODO Auto-generated method stub

		System.out.println(a-b);
	}
	
	public void mul(int a,double b) {
		// TODO Auto-generated method stub

		System.out.println(a*b);
	}
	
	public void mul(double a,double b) {
		// TODO Auto-generated method stub

		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		c.add(2, 3);
		c.add(1, 2, 3);
		c.sub(3.2, 1.1);
		c.sub(20, 10);
		c.mul(3.6, 3.6);
		c.mul(2, 3.8);
	}
}
