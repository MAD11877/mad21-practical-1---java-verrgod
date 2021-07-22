import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    /*System.out.print("Enter a number to represent the length of the base of a traingle: ");*/
    int x = in.nextInt();
    while (x-- > 0) {
      for (int i = x; i > 0; i--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
