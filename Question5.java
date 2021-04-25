import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter the number of inputs: ");
    int x = in.nextInt();
    int[] num = new int[x];
    while (x-- > 0){
      int i = in.nextInt();
      num[x] = i;
    }
    Arrays.sort(num);
    int element = Integer.MIN_VALUE, max_count=1, count=1;
    for(int a=1; a<num.length; a++){
      if(num[a] == num[a-1])
          count++;
      else{
          if(count >= max_count){
              max_count = count;
              element = num[a];
          } 
          count =1;
      }
    }
    //System.out.println(Arrays.toString(num));
    System.out.println(element);
  }
}
