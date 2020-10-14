import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ArrayProblems{
    public static void main(String[] args){
        // int[] arr1 = {1, 4, 7, 9, 13, 17, 23, 27, 35, 44};
        
        int[] arr1 = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers from 1 to 54: ");
        for(int i = 0; i < arr1.length; i++) arr1[i] = input.nextInt();

        
        //print New Int array
        System.out.println("New array: " + Arrays.toString(arr1));


        //No.1
        binarySearch(1, arr1);
        //No.2
        System.out.println("Random number is " + getRandom(arr1));
        //N0.3-1
        System.out.println("Int Avarage is " + average(arr1));
        //No.3-2
        System.out.println("Double Avarage is " +  average(arr1));

        //make a double array for No.4
        double[] arr2 = new double[10];
        System.out.print("Enter ten double numbers: ");
        for(int d = 0; d < arr2.length; d++) arr2[d] = input.nextDouble();
        System.out.println("This is Double array: " + Arrays.toString(arr2));

        //No.4
        System.out.println("The minimum number is " + min(arr2));



    }
    public static void binarySearch(int key, int arr[]){
        int mid;
        int left = 0;
        int right = arr.length -1;

        while(right >= left){
            mid = (right + left) / 2;

            if(key == arr[mid]){
                System.out.println(key + " is in the array. Index is " + mid);
                break;
            }
            if(key < arr[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            } 
            System.out.println("Key is not in the array.");
            break;
        }
    }

    public static int getRandom(int... numbers){
       
        int random;
        boolean arrValue;

        do{
            arrValue = false;
            random =(int)(Math.random() * 54 + 1);
            for(int i : numbers){
                if(i == random){
                    arrValue = true;
                }
            }
        } while(arrValue);
        return random;

    }

    public static int average(int[] array){
        int sum = 0;
        for(int val : array)
            sum += val;
            return sum / array.length;
    }

    public static double average(double[] array){
        double sum = 0.0;
        for(double val : array)
            sum += val;
            return sum / array.length;
    }

    public static double min(double[] array){
        double min = array[0];
        for(double i : array){
            if(i < min)
                min = i;
        }
        return min;

    }
}