public class StudentProfile {
  String firstName;
  String lastName;
  double graduateYear;
  double gpa;
  String declaredMajor;


  public StudentProfile(String firstName, String lastName, double graduateYear, double GPA, String declaredMajor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gpa = gpa;
    this.graduateYear = graduateYear;
    this.declaredMajor = declaredMajor;
  }

  // A behavior that displays if graduate year is incremented by one because of course availablitly
  public void incrementExpectedGraduationYear() {
    this.graduateYear = this.graduateYear + 1;
  }
}
