package Recursion;

public class firseOccerence {
    public static int findElement (int[] arr, int i, int key) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return findElement(arr, i+1, key);
    }
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4,5};
        int key = 8;
        System.out.println(findElement(arr, 0, key));
    }
}
