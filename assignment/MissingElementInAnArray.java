package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,7,6,8};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				System.out.println(a[i]);
			}
		}
	}

}
