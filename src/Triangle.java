public class Triangle {

  // Properties

  static int numOfSides;
  double base;
  double height;
  double sideLenOne;
  double sideLenTwo;
  double sideLenThree;

  // Behaviors
  public Triangle(double base, double height,
      double sideLenOne, double sideLenTwo, double sideLenThree) {
    this.base = base;
    this.height = height;
    this.sideLenOne = sideLenOne;
    this.sideLenTwo = sideLenTwo;
    this.sideLenThree = sideLenThree;
  }

  public double findArea() {
    return (this.base * this.height) / 2;
  }

  public void calculateTriangleType() {
    // Equilateral, isosceles, or selene
  }

}
