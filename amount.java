public class amount {
  public static void main(String[] args) {
      int itemA = 101;
      int itemB = 55;
      int itemC = 200;
      double totalPrice = itemA + itemB + itemC;
      double discprice = totalPrice - 0.1 * totalPrice;
      double amountPay = discprice + 0.05 * discprice;
      System.out.println(" the total" + amountPay);
  }
}
