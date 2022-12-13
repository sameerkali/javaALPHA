public class uni{
    public static int pattern(int n){
        for(int i = 1 ; i<=n; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main (String[] args){
        System.out.print(pattern(5));
    }
}