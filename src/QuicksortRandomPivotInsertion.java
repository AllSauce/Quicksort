import java.util.Random;

public class QuicksortRandomPivotInsertion extends InsertionSort{

  Random rand = new Random();

  public void quickSort(int[] arr, int low, int high){
    while(low < high){

        if(high - low < 10){
          sort(arr);
          break;
        }
        else{
            int pivot = rand.nextInt(high-1);

            if(pivot - low < high - pivot){
              quickSort(arr, low, pivot-1);
              low = pivot+1;
            }
            else{
              quickSort(arr, pivot+1, high);
              high = pivot-1;
            }
        }
    }
  }
}
