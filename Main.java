import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word = input.nextLine();
    System.out.println(word.length());
  }
}