package interview_prep.acciojobs;
import java.util.*;




public class lastTwofibonacci {
			public static void main(String[] args) {
		  int n = 255; // example input
	  
		  int a = 0;
		  int b = 1;
		  int c = 0;
		  for (int i = 2; i <= n; i++) {
			c = (a + b) % 100;
			a = b;
			b = c;
		  }
		  System.out.println(c);
		}
	  }
	  



// public static void main(String[] args) {
    
//     // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
//     long firstNum = 0L;
//     long secoundNum = 1;
//     int num = 10;
//     long sum = 0L;
    
//     for(long i = 1; i < num-1; i++) {
//         sum = firstNum + secoundNum;
//         firstNum = secoundNum;
//         secoundNum = sum;
//     }
//     System.out.print("The sum of n-1 fab.. number is "+sum);
// }
// }


/*public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		if(n%2==1){
				System.out.println("still running");
		}
		
		else{
			int time = 0;
			for(int i=0;i<n;i+=2){
				time += a[i+1]-a[i];
			}
		System.out.println(time);
		}
    } */
