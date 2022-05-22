import java.util.Scanner;

public class Main {

  public static void main(String[] args) {


    String studentFirstName = "Kacey";
    String studentLastName = "Brance";
    double studentGpa = 3.95;
//    int studentAge = 17;
//    char firstInitial = studentFirstName.charAt(0);
//    char lastInitial = studentLastName.charAt(0);
//    boolean hasPerfectAttendance = true;

    System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);
    System.out.println("What do you want to update it to?");

    Scanner input = new Scanner(System.in);
    studentGpa = input.nextDouble();

    System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGpa);
  }
}
