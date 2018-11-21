/*==============================================================================
Zachary Hadjah                      November 21th, 2018
Senior Year                         Side Project

Description:
This program will prompt the user for two arrays. The isRotated function will 
check to see if the lengths are both the same size for the elements. It will 
then check whether the array has been rotated by checking the elements of the
original from the first element to the last, while the other array will be 
checked from the last element up until the first. 

For example:

1st array = [1,2,3]
2nd array = [3,2,1]

output: Array is rotated
==============================================================================*/
package isarrayrotated;

import java.util.Arrays;
import java.util.Scanner;

public class IsArrayRotated 
{
    public static void main(String[] args) 
    {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        final int arrayCap = 5; 
        boolean rotation; 
        char again = 'Y';
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program takes two arrays, compares them, and "
        + "determines whether the original array has been rotated and put "
        + "into another array. \nTest the program by Entering 5 numbers into a"
                         + " array. ");
        while( (again == 'Y') || (again =='y') )
        {
            
            //user enters integers into the first array
            for(int i = 0; i< arrayCap; i++)
                firstArray[i] = scan.nextInt();

            System.out.println( Arrays.toString(firstArray) + " is your array. If you \n"
                             + "would like the program to confirm that the array is rotated"
                             + " then simply type in the first array you entered but in \n"
                             + "reverse order. If not, then type in a different array.");

            //user enters integers into the second array
            for(int i = 0; i< arrayCap; i++)
                secondArray[i] = scan.nextInt();

            //isRotated will compare if the array is rotated
            rotation = isRotated(firstArray, secondArray);

            if(rotation == true)
            {
                System.out.println("Array is rotated");
            }else{
                System.out.println("Array is not rotated!");
            }
            
            //check if user wants to repeat
            System.out.println("Try again? (Y/N)");
            again = scan.next(".").charAt(0);
        }
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
}
