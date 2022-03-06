public class InsertionSort implements IntSorter{

    /* Instantiate an array */
    private int[] array;

    /*
     * Insertion sort.
     */
    public void sort(int[] arr){

      for(int i = 1; i < arr.length; i++){
        int temp = arr[i];
        int j = i;

        while(j >= 0 && arr[j] > temp){
          arr[j] = arr[j-1];
          j--;

        }
        arr[j] = temp;
      }
    }

    /*
     * Partition of array.
     */
    public int partition(int[] arr, int low, int high){
      int pivot = arr[high];

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

    /*
     * Simple exchange of two numbers places in an array.
     */
    private void exchangeNumbers(int i, int j){
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

}
