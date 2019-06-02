public class ReverseString {
  public static String Reverse(String string) {
    return new StringBuilder(string).reverse().toString();
  }

  public static void main(String[] args) {
    String message = "Hello World!";
    String reversed = Reverse(message);
    System.out.println(message);
    System.out.println(reversed);
  }
}