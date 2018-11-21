/*
 * {Westfield State University}:Program Design 2
 * Zachary Hadjah
 * 
 */
package isarrayrotated;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsArrayRotatedTest 
{
    
    public IsArrayRotatedTest() {
    }
  
    /**
     * Test of isRotated method, of class IsArrayRotated.
     */
    @Test
    public void testIsRotated() {
        System.out.println("isRotated");
        int[] original = {0,0,1,1,72,6,9,0,2,1,0};
        int[] tempArray = {0,1,2,0,9,6,72,1,1,0,0};
        boolean expResult = true;
        boolean result = IsArrayRotated.isRotated(original, tempArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
