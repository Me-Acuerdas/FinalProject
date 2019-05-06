import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class UI {
  public static void main(String[] args){
    boolean exit = false;
    Random rand = new Random();
    ArrayList<Integer> imput = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

    while(exit!=true){
      System.out.println("Welcome to the Sorting algorithm tester. \n Select a size of list that you want to sort:");
      int numberOfInts = scan.nextInt();
      System.out.println("You chose a list of " + numberOfInts  +" numbers. \n What should the range be to, select the upper bound:");
      int upperBound = scan.nextInt();
      System.out.println("The list will have " + numberOfInts + " elements, with a range from 0 to "+ upperBound+".");

      for(int i = 0;i<numberOfInts;i++)
        imput.add(rand.nextInt(upperBound));

      for(int i = 0; i<numberOfInts;i++){
          System.out.print("\t"+imput.get(i));
          if(i%5==0)
            System.out.println();

      }
      long startTime = System.nanoTime();
      ArrayList<Integer> newList = BubbleSorter.sort((ArrayList<Integer>) imput.clone());
      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println("\t How fast is BubbleSorter in miliseconds: "+duration/1000000);

      long startTime2 = System.nanoTime();
      ArrayList<Integer> newListOne = CockTailShaker.sort((ArrayList<Integer>) imput.clone());
      long endTime2 = System.nanoTime();
      long duration2 = (endTime2 - startTime2);
      System.out.println("\t How fast is CockTail Shaker in miliseconds: "+duration2/1000000);

      for(int i = 0; i < newListOne.size(); i++ ){
          System.out.print("\t" + newListOne.get(i));
          if(i%5==0 && )
            System.out.println();
       }
      exit = true;
    }
  }
}
