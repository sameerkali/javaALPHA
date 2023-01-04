public class quickSort {
    public static void quicksort (int[] arr, int si, int ei) {
        //BaseCase
        if (si >= ei) return;
        //Kaam
        int pInd = partition(arr, si, ei);
        quicksort(arr, si, pInd-1); //left
        quicksort(arr, pInd+1, ei); //right
    }
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to male place for els smaller then pivot

        for (int j=si; j<ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]
        arr[i] = temp;
        return i;
    }
    public static void print(int arr[]) {
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
     int arr[] = {6,3,9,5,2,8};
     quicksort(arr, 0, arr.length-1);
      print(arr);
    }
}

