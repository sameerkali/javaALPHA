
public class mergeSort {
    public static void mergesort(int[] arr, int si, int ei) {
        //BaseCase
        if (si >= ei) return;
        //Kaam
        int mid = si + (ei - si) / 2;   //(si+ei)/2
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
        
    }
    public static void merge (int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copy temp to my original array
        for (k=0,i=si; k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }

    }
    public static void print(int arr[]) {
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,-100,-23,2,8};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}


//O(n logn) timeComplexity