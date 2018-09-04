/*==============================================================================
Zachary Hadjah                      February 9th, 2018
Junior Year                         Side Project

Description:
This program will create two arrays, one original and one array that will be compared 
to the original. The isRotated function will check to see if the lengths are both 
the same size for the elements. It will then check whether the array has been
rotated by checking the elements of the original from the first element to the 
last, while the other array will be checked from the last element up until the 
first. 
Next, this program will tell you to enter an array of single digit integers. The 
rotateArray function will then rotate the numbers the user enters. 
For example:

    User input: 1 2 3 4 5
    Function output: 5 4 3 2 1
==============================================================================*/
package isarrayrotated;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

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
                         + " with contents \n [9,8,7,6,5,4,3,2,1,0]");
        
        rotation = isRotated(original, rotatedArray);
        if(rotation)
        {
            System.out.println("The original array has been rotated!");
        }else{
            System.out.println("The original array has not been rotated");
        }
        
        ArrayList<Integer> userArray = new ArrayList<Integer>(9);
        
        System.out.println("This program can also rotate arrays that contain "
                         + "single digit integers.\n Enter 9 single digit "
                         + "integers separated by spaces");
        
        /*
        userArray.add(scan.nextInt());
        for(int i = 0; i<userArray.size(); i++)
        {
            //*****problem
            if(scan.next(). )
                break;
            else         
                userArray.add(scan.nextInt());
        }*/
        
        
        //reads input as string, will check to see if element in array is empty or not
        String input = scan.nextLine();
        String[] numbers = input.split(" ");
        for(String number:numbers)
        {
            try
            {
                if(number.isEmpty())
                continue;
                userArray.add(Integer.parseInt(number));
            }   
            catch(Exception e)
            {
                System.out.println("Invalid input. Please enter single digit "
                                 + "integers");
            }
        }
        
        
        
        System.out.println("The array you entered is: " + userArray.toString() +"\n");
        
        rotateArray(userArray);
        
        System.out.println("When your array is rotated, it looks like this: \n" + 
                           userArray.toString());
                           
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
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> userArray)
    {    
        int replace = 0;
        int inc = 1;
        int indexVariable = 0;
        
        //if number of elements equals an even number
        if(userArray.size() % 2 == 0)
        {
            for(int i = 0; i < (userArray.size()/2);i++)
            {
                replace = userArray.get(i);                             
                userArray.set(userArray.get(i),userArray.size() - inc );
                userArray.set(userArray.size() - inc, replace);
                inc++;
            }
        }
        
        //if number of elements equals an odd number
        else
        {
            for (int i = 0; i <(userArray.size()/2) ; i++) 
            {
                replace = userArray.get(i);                             
                userArray.set(userArray.get(i),userArray.size() - inc );
                userArray.set(userArray.size() - inc, replace);
                inc++;
            }
        }
        
        return userArray;
        
    }  
}
