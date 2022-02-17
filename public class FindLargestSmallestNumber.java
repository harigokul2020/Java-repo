public class FindLargestSmallestNumber {

  public static void main(String[] args) {

    int numbers[] = new int[] { 555, 312, 495, 908, 282, 181, 09, 379, 510 };

    int smallest = numbers[0];
    int largetst = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > largetst)
        largetst = numbers[i];
      else if (numbers[i] < smallest)
        smallest = numbers[i];
    }

    System.out.println("Largest Number is : " + largetst);
    System.out.println("Smallest Number is : " + smallest);
  }
}