public class Main {

  public static void main(String[] args) {

    String studentFirstName = "Kacey";
    String studentLastName = "Brance";
    int studentAge = 17;
    double studentGpa = 3.95;
    char firstInitial = studentFirstName.charAt(0);
    char lastInitial = studentLastName.charAt(0);
    boolean hasPerfectAttendance = true;

    System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);
    System.out.println(studentAge);
    System.out.println(hasPerfectAttendance);
  }
}
