package package1;
import java.util.Scanner;

public class floatingnumber {
	




	    public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("first floating number:");
	        double numb1= sc.nextDouble();
	        System.out.println("second floating number:");
	        double number2= sc.nextDouble();
	        if (Math.ceil (Math.abs(numb1-number2))<=0.01){
	           System.out.println("these are same numbers");


	        }
	        else {
	            System.out.println("these are different numbers.");
	        }
	    }
}
	
