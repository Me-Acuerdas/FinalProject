import java.util.ArrayList;
import java.util.Collections;
public class BubbleSorter {
  public static ArrayList<Integer> sort(ArrayList<Integer> imputList){

    ArrayList<Integer> returnList = imputList;
    boolean ordered = false;
    int rep = 0;
    int swaps = 0;

  while(!ordered){
      ordered = true;
      for(int j = 0; j < returnList.size()-1; j++){
        if(returnList.get(j)>returnList.get(j+1)){
          Collections.swap(returnList, j,j+1);
          ordered = false;
          swaps ++; 
        }// end if
      }//End  for

      rep ++;

    }//End While
    System.out.println("\n \n \t Number of full repititions: "+rep +"\t Number of Swaps: "+swaps);
    return returnList;
  }//End Sort
}//End Class
