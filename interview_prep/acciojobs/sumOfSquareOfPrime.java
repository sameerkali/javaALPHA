package interview_prep.acciojobs;


public class sumOfSquareOfPrime {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(n%2!=0){
                sum += i*i;
            }
        }
        System.out.println(sum);
    }
}
