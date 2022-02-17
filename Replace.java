package package1;

public class Replace {

	public static void main(String[] args) {
		String i=("The quick brown fox jumps over the lazy dog.");
		String j=i.replaceAll("fox","cat");
		System.out.println("the given sentence is"+i);
		System.out.println("the replace sentence is"+j);

	}

}
