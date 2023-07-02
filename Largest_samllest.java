package Array;
import java.util.*;
public class Largest_samllest {
    public static void main(String args []){
        int arr[] ={12,45,68,25,90,35};
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            max= Math.max(max,arr[i]);
            min = Math.min(min , arr[i]);
        }
        System.out.println("The samllest number is "+min);
        System.out.println("The largest number is "+max);
    }
}
