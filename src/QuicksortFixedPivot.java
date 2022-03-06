public class QuicksortFixedPivot extends InsertionSort{

          public void quickSort(int[] arr, int low, int high){
            if(low < high){
              int pivot = partition(arr, low, high);

              quickSort(arr, low, pivot-1);
              quickSort(arr, pivot+1, high);
            }
          }
}
