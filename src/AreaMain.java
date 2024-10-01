/*
  Create a class to print the area of a square and a rectangle.The class has two
   methods ‘printArea’
  and ‘printPerimeter’ with the same name but different number of parameters.
   The method for printing area of
Rectangle has two parameters which are length and breadth respectively while
 the other method for printing area of square has one parameter which is side of square.
 */
import java.util.*;
public class AreaMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square();

        System.out.println("Enter value of side : ");
        double side = sc.nextDouble();
        Square.printArea(side);
        Square.printPerimeter(side);
        System.out.println("-------------------------------------------");


        System.out.println("Enter value of Length : ");
        double length = sc.nextDouble();
        System.out.println("Enter value of Breadth : ");
        double breadth = sc.nextDouble();

        Rectangle.areaOfRecctangle(length, breadth);
        Rectangle.perimeterOfRectangle(length, breadth);
        System.out.println("-------------------------------------------");

    }
}

/*
Enter value of side :
4.0
Area of Square: 16.0
Perimeter of Square is: 16.0
-------------------------------------------
Enter value of Length :
2
Enter value of Breadth :
3
Area of Rectangle: 6.0
Perimeter of Rectangle: 10.0
-------------------------------------------
 */