import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String question = "If a dog is not a cat, what is it?";
    String choiceOne = "bird";
    String choiceTwo = "cat";
    String choiceThree = "dog";
    String correct = "This is the correct answer";
    String incorrect = "This is NOT the correct answer";

    System.out.println(question);
    System.out.println(choiceOne);
    System.out.println(choiceTwo);
    System.out.println(choiceThree);
    System.out.println("Select your answer");

    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    if (choiceThree.equals(input.toLowerCase())) {
      System.out.println(correct);
    } else {
      System.out.println(incorrect);
    }
  }
}
