import ReverseString;

public class Palindrome {
  public static boolean IsPalindrome(String string) {
    String reversed = ReverseString.Reverse(string);
    return string.equals(reversed);
  }

  public static void main(String[] args) {
    String message = "tacocat";
    boolean palindrome = IsPalindrome(message);

    System.out.print(message);

    if (palindrome) {
      System.out.println(" is a palindrome!");
    } else {
      System.out.println(" is not a palindrome.");
    }
  }
}