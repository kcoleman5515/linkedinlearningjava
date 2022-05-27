
public class Main {
//  public static void announceDeveloperTeaTime() {
//    System.out.println("Waiting for developer tea time...");
//    System.out.println("Type in any word and press enter to start developer tea time");
//    Scanner input = new Scanner(System.in);
//    input.next();
//    System.out.println("It's developer tea time!");
//  }

  public void Triangle(double base, double height,
      double sideLenOne, double sideLenTwo, double sideLenThree) {
    
  }


  public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    System.out.println("What is my total owed for my meal?");
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    return result;

  }

  public static double calculateSalary(double hourlyPay, double hoursWorkedPerWeek, int vacationDays) {
    if(hoursWorkedPerWeek < 0) {
      return - 1;
    }
    if(hourlyPay < 0) {
      return - 1;
    }

    double weeklyPaycheck = hourlyPay * hoursWorkedPerWeek;
    double unpaidTime = vacationDays * hourlyPay * 8;
    return (weeklyPaycheck * 52) - unpaidTime;
  }

  public static void main(String[] args) {
    double salary = calculateSalary(18, 40, 8);
    System.out.println("Estimated yearly salary before tax is " + salary);


//    double groupTotalMealPrice = calculateTotalMealPrice(110, .2, .08);
//    System.out.println(groupTotalMealPrice);
//
//    double individualMealPrice = groupTotalMealPrice / 5;
//    System.out.println(individualMealPrice);
  }
}
