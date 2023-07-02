package Array;
import java.util.Scanner;
public class prime_Numbers {
    public static boolean isPrime(int n){
        for(int i = 2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Printprime(int range){
        for(int i = 2; i<=range; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        Printprime(range);
    }
}
