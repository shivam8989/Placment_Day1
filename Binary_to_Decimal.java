package Array;
import java.util.Scanner;
public class Binary_to_Decimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int pow = 0;
        int lastd = 0;
        int decimal = 0;
        while (n>0){
            lastd = n%10;
            decimal = decimal+(lastd*(int )Math.pow(2,pow));
            pow++;
            n = n/10;

        }
        System.out.println("The decimal form of binary number is "+decimal);
    }
}
