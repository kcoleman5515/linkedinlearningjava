import java.util.Scanner;

public class Main {
//  public static void announceDeveloperTeaTime() {
//    System.out.println("Waiting for developer tea time...");
//    System.out.println("Type in any word and press enter to start developer tea time");
//    Scanner input = new Scanner(System.in);
//    input.next();
//    System.out.println("It's developer tea time!");
//  }

  public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    System.out.println("What is my total owed for my meal?");
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    return result;

  }

  public static void main(String[] args) {

    double groupTotalMealPrice = calculateTotalMealPrice(110, .2, .08);
    System.out.println(groupTotalMealPrice);

    double individualMealPrice = groupTotalMealPrice / 5;
    System.out.println(individualMealPrice);
  }
}
