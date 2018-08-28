/*==============================================================================
Zachary Hadjah                      February 9th, 2018
Junior Year                         Side Project

Description:
This program will take two arrays, one original and one array that will be compared 
to the original. The isRotated function will check to see if the lengths are both 
the same size for the elements. It will then check whether the array has been
rotated by checking the elements of the original from the first element to the 
last, while the other array will be checked from the last element up until the 
first.
==============================================================================*/
package isarrayrotated;

import java.util.Arrays;
import java.util.Scanner;

public class IsArrayRotated 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program takes two arrays, compares them, and "
        + "determines whether the original array has been rotated and put "
        + "into another array. \nWatch what happens when the original "
        + "array = [0,1,2,3,4,5,6,7,8,9] is compared to an array  with contents: \n"
        + "[9,7,5,3,1,8,6,4,2,0]");
        
        int[] original = {0,1,2,3,4,5,6,7,8,9};
        int[] notRotated = {9,7,5,3,1,8,6,4,2,0};
        int[] rotatedArray = {9,8,7,6,5,4,3,2,1,0}; 
        boolean rotation;      

        rotation = isRotated(original, rotatedArray);
        if(rotation == true)
        {
            System.out.println("The original array has been rotated!");
        }else{
            System.out.println("The original array has not been rotated");
        }
        
        System.out.println("\n Watch what happens when the original array is compared to an array"
                         + "with contents \n [9,8,7,6,5,4,3,2,1,0]");
        
        rotation = isRotated(original, rotatedArray);
        if(rotation == true)
        {
            System.out.println("The original array has been rotated!");
        }else{
            System.out.println("The original array has not been rotated");
        }
        
        //user will enter array and will get rotated
        int[] userArray = new int[10];
        
        System.out.println("This program can also rotate arrays.\n" +
                           "Enter 10 single digit integers separated by spaces");
        for(int i = 0; i<userArray.length; i++)
        {
            userArray[i] = scan.nextInt();
        }
        
        System.out.println("The array you entered is: " + Arrays.toString(userArray) +"\n"+
                           "When your array is rotated, it looks like this: \n" + 
                           Arrays.toString(rotateArray(userArray)));
    }
    
    public static boolean isRotated(int[] original, int[] tempArray)
    {
        boolean isRotated = true;
        int inc = 1;
        
        while((original.length == tempArray.length) && (isRotated == true))
        {
            //loop to find all elements of original
            for(int i= 0; i<original.length;i++)
            {
                //compare element in original array to element in tempArray
                if(original[i] != tempArray[tempArray.length - inc])
                {
                    isRotated = false;
                }
                inc++;
            }
            break;
        }
        return isRotated;
    }    
    
    //Will rotate the array that the user entered 
    public static int[] rotateArray(int[] userArray)
    {    
        int replace = 0;
        int inc = 1;
        
        //if number of elements equals are even
        if(userArray.length % 2 == 0)
        {
            for(int i = 0; i < (userArray.length /2);i++)
            {
                //head = userArray[i];
                //tail = userArray.length - inc;   //dont forget to increment inc
                replace = userArray[i];
                userArray[i] = userArray.length - inc;
                userArray[userArray.length - inc] = replace;
                inc++;
            }
        }
        return userArray;
    }
    
   
}
