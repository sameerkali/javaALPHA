
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, opr, sum = 0;
        num = sc.nextInt();
        temp = num;

        while (temp > 0) {
            opr = temp % 10;
            sum += opr * opr * opr;
            temp = temp / 10;
        }
        System.out.println(sum);
    }
}
