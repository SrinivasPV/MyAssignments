package week1.day2.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=153;
		int rem=0;
		int c=a;
		int b;
		//int c;
		//int d;
		
		while(a>0)
		{
			b=a%10;
			rem=rem+(b*b*b);
			a=a/10;
			/*c=a%10;
			a=a/10;
			d=a%10;
			a=a/10; */
		}
		if(c == rem)
		
		System.out.println(rem + " is an Armstrong number");
		
		else
			System.out.println(rem + " is not an Armstrong number");
	}

}
