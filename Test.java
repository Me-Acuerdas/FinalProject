import java.util.ArrayList;
import java.util.Random;

public class Test{
  public static void main (String [] args){
    Random rand = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i =0; i<7;i++)
      list.add(rand.nextInt(25));
    for(int i = 0; i<7;i++)
      System.out.print("\t"+list.get(i));

    ArrayList<Integer> newList = BubbleSorter.sort((ArrayList<Integer>) list.clone());
    ArrayList<Integer> newListOne = CockTailShaker.sort((ArrayList<Integer>) list.clone());
    
    
    System.out.println();
    for(int i = 0;i<7;i++){
      if(i%10 ==0)
        System.out.println();
      System.out.print("\t" + newList.get(i));
    }//End for

    System.out.println();

    for(int i = 0; i<7;i++)
      System.out.print("\t"+list.get(i));

    for(int i = 0;i<7;i++){
      if(i%10 ==0)
        System.out.println();
      System.out.print("\t" + newListOne.get(i));
    }//End for
  }//End Main
}//End Class
