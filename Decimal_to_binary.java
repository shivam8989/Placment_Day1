package Array;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Decimal_to_binary {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rem = 0;
        int binary = 0;
        int pow = 0;
        while(n>0){
            rem = n%2;
            binary= binary+(rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("The binary form of number is "+binary);

    }
}