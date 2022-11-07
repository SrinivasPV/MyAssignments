package week1.day2.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=8;
		int first=0;
		int sec = 1;
		int sum=0;
		System.out.printf("%d ",sum);
		
		for(int i= 1;i<a-1;i++)
		{
			sum=first+sec;
			first=sec;
			sec=sum;
		    System.out.printf("%d ",sum);
		    
		}    
	}

}
