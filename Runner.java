import java.util.ArrayList;
import java.util.Random;
public class Runner{
  public static void main(String[] args){
    Random rand = new Random();
    ArrayList<Integer> imput = new ArrayList<Integer>();

    for(int i = 0;i<50000;i++)
      imput.add(rand.nextInt(10000));


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

    long startTime3 = System.nanoTime();
    ArrayList<Integer> newListTwo = BubbleSorter2.sort((ArrayList<Integer>) imput.clone());
    long endTime3 = System.nanoTime();
    long duration3 = (endTime2 - startTime2);
    System.out.println("\t How fast is bubble2 Shaker in miliseconds: "+duration3/1000000);





  }//End Main
}//End class
