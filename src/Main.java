import java.util.Scanner;

public class Main {
  public static void announceDeveloperTeaTime() {
    System.out.println("Waiting for developer tea time...");
    System.out.println("Type in any word and press enter to start developer tea time");
    Scanner input = new Scanner(System.in);
    input.next();
    System.out.println("It's developer tea time!");
  }

  public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    System.out.println("What is my total owed for my meal?");
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    System.out.println("What is my total owed for my meal?");

  }

  public static void main(String[] args) {
    System.out.println("Welcome to your new job");

    announceDeveloperTeaTime();

    System.out.println("Write code");
    System.out.println("Review code");

    announceDeveloperTeaTime();

    System.out.println("Get promoted!");
  }
}
