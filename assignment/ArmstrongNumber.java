package week1.day2.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=153;
		int b;
		int c;
		int d;
		
		while(a>0)
		{
			b=a%10;
			a=a/10;
			c=a%10;
			a=a/10;
			d=a%10;
			System.out.println((d*d*d)+(c*c*c)+(b*b*b));
			a=a/10;
		}
		
		
	}

}
