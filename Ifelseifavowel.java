package package1;

import java.util.Scanner;

public class Ifelseifavowel {

	public static void main(String[] args) {
		char a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		a=sc.next().charAt(0);
		char i=Character.toUpperCase(a);
		if (i>='A'&& i<='Z') {
			if(i=='A') {
				System.out.println("The entered alphabet is a vowel "+i);
			}
			else if(i=='E') {
				System.out.println("The entered alphabet is a vowel "+i);
				
			}
			else if(i=='I') {
				System.out.println("The entered alphabet is a vowel "+i);
		}
			else if(i=='O') {
				System.out.println("The entered alphabet is a vowel "+i);
		

	}
			else if(i=='U') {
				System.out.println("The entered alphabet is a vowel "+i);

}
			else {
				System.out.println("the entered character is " +i+ " not a vowel");
			}
			
		}
		else {
			System.out.println("the entered character is not an alphabet");
		}
	}
}
