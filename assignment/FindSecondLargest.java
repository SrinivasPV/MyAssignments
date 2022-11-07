package week1.day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b=a.length-1;
		Arrays.sort(a);
		System.out.println(a[b-1]);

	}

}
