package interview_prep.acciojobs;
import java.util.*
;
public class factorialinLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;                            // use **long** insted of int because int is not cabable to store this amount of integers

        for(int i=1; i<=num;i++){
            factorial *= i ;
        }
        System.out.println(factorial);
    }
}
