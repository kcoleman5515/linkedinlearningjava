import java.util.Scanner;

public class Main {
//  public static void announceDeveloperTeaTime() {
//    System.out.println("Waiting for developer tea time...");
//    System.out.println("Type in any word and press enter to start developer tea time");
//    Scanner input = new Scanner(System.in);
//    input.next();
//    System.out.println("It's developer tea time!");
//  }

  public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    System.out.println("What is my total owed for my meal?");
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    System.out.println("Your total meal price is " + result);

  }

  public static void main(String[] args) {

    calculateTotalMealPrice(22.5, .2, .08);

  }
}
