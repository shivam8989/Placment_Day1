package Array;
import java.util.*;
public class Binary_Search {
    public static void binarysearch(int arr[], int x){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start +end)/2;
            if(arr[mid]==x){
                System.out.println(mid);
            }
            if(arr[mid]<x){
                start= mid+1;
            }else{
                end = mid-1;
            }
        }

    }
   public static void main(String args[]){
       int arr[] = {12,13,14,15,16};
       int x = 15;
       binarysearch(arr,x);
   }
}