package package1;

import java.util.Scanner;

public class Smallestandlargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++){
		System.out.println("Enter the element"+(i+1)+";") ;
		arr[i]=sc.nextInt();
		}
   int min,max;
   min=arr[0];
   max=arr[0];
   for(int i=0;i<n;i++) {
	   if(min>arr[i]) {
		   min=arr[i];
		   
	   }
	   if (max<arr[i] ){
		max=arr[i];
		
	   }
	   
   }
   System.out.println("The smallest value is:"+min);
   System.out.println("the largest value is:"+max);
	}

}
;