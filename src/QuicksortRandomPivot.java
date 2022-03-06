import java.util.Random;

public class QuicksortRandomPivot extends InsertionSort{

        Random rand = new Random();

        public void quickSort(int[] arr, int low, int high){
          if(low < high){
            random(arr, low, high);
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
          }
        }

        public int partition(int[] arr, int low, int high){
          int pivot = arr[rand.nextInt(low + (high - low)/2)];

          int i = (low-1);

          for(int j = low; j <= high-1; j++){
            if(arr[j] < pivot){
              i++;
              exchangeNumbers(i, j);
            }
          }
          exchangeNumbers(i+1, high);

          return i+1;
        }

        private void random(int[] arr, int low, int high){
          int pivot = rand.nextInt(high -1) +1;
          exchangeNumbers(arr, pivot, high);
        }
}
