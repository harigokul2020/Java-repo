package package1;

import java.util.Scanner;

public class factorialno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int f=1;
for (int i=1;i<=num;i++) {
	f=f*i;
}
System.out.println("factorial of the number:"+f);

	}

}
