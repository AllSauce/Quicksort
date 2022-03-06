public class Mergesort implements IntSorter{

    private void merge(int a[], int low, int mid, int high) {
        int [] b = new int[a.length +1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }
        while (i <= mid)
            b[k++] = a[i++];

        while (j <= high)
            b[k++] = a[j++];

        k--;
        while (k >= 0) {
            a[low + k] = b[k];
            k--;
        }
    }

    @Override
    public void sort(int [] arr){
        if(arr.length <= 1)return;

        int low = 0;
        int high = arr.length-1;

        mergesort(arr, low, high);
    }

    public void mergesort(int a[], int low, int high) {
        if(high - low < 10){
            insertionSort(a);
        }
        else {
            int mid = (high + low)/2;
            mergesort(a, low, mid);
            mergesort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    private void insertionSort(int[] arr){
      for (int i = 1; i < arr.length; ++i) {
          int key = arr[i];
          int j = i - 1;

          //If greater than key swap further to the right
          while (j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];
              j = j - 1;
          }
          arr[j + 1] = key;
      }
    }
}
