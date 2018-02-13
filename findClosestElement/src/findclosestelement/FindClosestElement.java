/*=============================================================================

==============================================================================*/
package findclosestelement;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zach
 */
public class FindClosestElement 
{
    static final int[] array = {-14,-9,-4,1, 6, 11,16};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char restart = 'Y';
        Scanner scan = new Scanner(System.in);

        try 
        {
           while(restart == 'Y' || restart == 'y')
            {
                int userNum = 0;

                System.out.println("This program has created an array of sorted integers:"
                        +Arrays.toString(array)+"\n Type in a value between -14 and 16 "
                        + "and the program will guess the closest number in the to your number: ");
                userNum = scan.nextInt();
                
                while(userNum<-14 || userNum>16)
                {
                    System.out.println("Please enter a number less than or equal "
                            + "to  16 or greater than or equal to -14");
                    userNum = scan.nextInt();
                }

                System.out.println("The closest number to your nubmer in the array is: "
                                   +findClosestNum(userNum)+ "\n Try again? (Y/N)");
                restart = scan.next().charAt(0);
                while((restart != 'y') || (restart != 'Y') || (restart != 'n') || (restart != 'N'))
                {
                    System.out.println("Please enter valid input (Y/N)");
                    restart = scan.next().charAt(0);
                }

            } 
        }
        
        catch (InputMismatchException e) 
        {
            System.out.println("Please input an integer from -14 to 16 \n");
            
        }       
    }
    
    public static int findClosestNum(int userNum)
    {
        int closestNum = 0;
        
        if((userNum >=-16) && (userNum<=-12))
            closestNum = -14;
        if((userNum >=-11) && (userNum<=-7))
            closestNum = -9;
        if((userNum >=-6) && (userNum<=-2))
            closestNum = -4;
        if((userNum >=-1) && (userNum<=3))
            closestNum = 1;
        if((userNum >=4) && (userNum<=8))
            closestNum = 6;
        if((userNum >=9) && (userNum<=13))
            closestNum = 11;
        if((userNum >=14) && (userNum<=18))
            closestNum = 16;
        
        return closestNum;       
    }
    
}
