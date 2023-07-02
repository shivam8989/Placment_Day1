package Array;
import java.util.*;

public class Linear_Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int arr []  = new int[size];
        System.out.println("Enter the elements i array");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array");
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        for(int i = 0; i<size; i++){
            if(x==arr[i]){
                System.out.println("Entement found at index "+i);
                  break;
            }else{
                System.out.println("Element Not found");

            }
        }
    }


}
