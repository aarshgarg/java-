package practice;
import java.util.*;
public class ArrayLength {
    public static void main(String[] args) {


        int arr[] = new int[5];
        arr[0] = 1;
        arr[1]=2;
        System.out.println(arr.length);
        System.out.println(System.currentTimeMillis());

        for(int i=0;i<=arr.length;i++)

        {

            System.out.println("elements of the array is : "+arr[i] );
            System.out.println(Arrays.toString(arr));
        }
    }
}
