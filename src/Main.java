
public class Main {


  public static void main(String[] args) {
   StudentProfile studentProfileA = new StudentProfile("John", "Baxter", 2022, 3.5, "Psychology");
   StudentProfile studentProfileB = new StudentProfile("Kora", "Avatar", 2024, 3.9, "Programming");

   studentProfileA.incrementExpectedGraduationYear();
   System.out.println(studentProfileA.graduateYear);

    studentProfileB.incrementExpectedGraduationYear();
    System.out.println(studentProfileB.graduateYear);


    // Triangle Example Below
//    Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
//    Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
//
//    double triangleAArea = triangleA.findArea();
//    System.out.println(triangleAArea);
//
//    double triangleBArea = triangleB.findArea();
//    System.out.println(triangleBArea);
//
//    System.out.println(triangleA.sideLenThree);
//    System.out.println(triangleB.base);
//
//    System.out.println(Triangle.numOfSides);

  }
}
