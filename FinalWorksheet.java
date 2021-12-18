package practice;

import java.io.*;
class FinalWorksheet
{

    static int maxFreq(int []arr, int n)
    {

        // using moore's voting algorithm
        int res = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                res = i;
                count = 1;
            }

        }

        return arr[res];
    }

    // Driver code
    public static void main (String[] args) {
        int arr[] = {10,20,10,30,40,99,10};
        int n = arr.length;
        int freq =  maxFreq(arr , n);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == freq) {
                count++;
            }
        }
        System.out.println("Element " +maxFreq(arr , n) +" occurs "  +count +" times" );
    }

}