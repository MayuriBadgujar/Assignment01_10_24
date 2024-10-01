public class Square {
    /*
    /*
  Create a class to print the area of a square and a rectangle.The class has two
   methods ‘printArea’
  and ‘printPerimeter’ with the same name but different number of parameters.
   The method for printing area of
Rectangle has two parameters which are length and breadth respectively while
 the other method for printing area of square has one parameter which is side of square.
 */

    //  area of a square
    public static void printArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // perimeter of a square
    public static void printPerimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square is: " + perimeter);
    }
}
