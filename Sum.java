package package1;

public class Sum {
	public static void main(String[]args) {
	int pen=10;
	int pencil=5;
	int book=50;
	double totalprice=(6*pen)+(2*pencil)+(book);
	double discountprice=totalprice-(0.1*totalprice);
	double amountpayable=discountprice+(0.05*discountprice);
	System.out.println(amountpayable);
	
	}
	}
