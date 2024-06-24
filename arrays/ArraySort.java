package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
	/*
	int a[]= {1,5,6,3,3,7};
	
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);
	}
	*/
		
		int i ;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
		
		i=sc.nextInt();
		
		int a[]=new int[i];
		System.out.println("Enter elemments");
		
		for(int b=0;b<i;b++) {
		a[b]=sc.nextInt();
		}
		Arrays.sort(a);
		
		for(int j=0;j<a.length;j++) {
			
			System.out.println(a[j]);
		}
		
		sc.close();
}
}
