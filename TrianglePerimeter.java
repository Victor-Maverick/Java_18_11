import java.util.Scanner;

public class TrianglePerimeter{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the first edge: ");
int adjacent = input.nextInt();

System.out.println("Enter the second edge value of the triangle");
int opposite = input.nextInt();

System.out.println("Enter the third edge value of the triangle");
int hypotenuse = input.nextInt();

int squareAdjacent = adjacent * adjacent;
int squareOpposite = opposite * opposite;
int squareHypotenuse = hypotenuse * hypotenuse;
int edgeSquare = squareAdjacent + squareOpposite;
 int perimeter = opposite + adjacent + hypotenuse;

if (edgeSquare > squareHypotenuse)
  System.out.printf("the perimeter of the triangle is: %d", perimeter);

if (edgeSquare <= squareHypotenuse)
  System.out.println("INVALID INPUT");
}




}