package by.epam.javatraining.shmarlouski.maintask01.model;

import org.junit.Test;
import static by.epam.javatraining.shmarlouski.maintask01.model.VectorUtils.*;

import static org.junit.Assert.*;

/**
 * This class contains different static methods for working with vector.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */


public class VectorUtilsTest {
    @Test
    public void isValidSizeIsNull() throws Exception {

        Vector vector = null;

        assertFalse(isValidSize(vector));

    }

    @Test
    public void isValidSizeIsNotNull() throws Exception {

        Vector vector = new Vector(3);

        assertTrue(isValidSize(vector));

    }

    @Test
    public void fillVectorIsValid() throws Exception {
        Vector vector = new Vector(3);
        fillVector(vector);
        int emptyValue = 0;

        assertTrue(vector.getElement(0) > emptyValue);
    }

    @Test(expected=NullPointerException.class)
    public void fillVectorIsInvalid() throws Exception {

        Vector vector = null;
        fillVector(vector);
        int emptyValue = 0;

        assertFalse(vector.getElement(0) > emptyValue);
    }

    @Test
    public void fillVectorTest() throws Exception {

        Vector vector = new Vector(0);
        fillVector(vector);
        int emptyValue = 0;

        assertTrue(vector.getElement(0) > emptyValue);

    }

    @Test(expected=NullPointerException.class)
    public void findMinElementIsNotValidSize() throws Exception {
        Vector vector = null;
        vector.addElement(9);
        int expectedMin = 0;

        assertEquals(expectedMin, findMinElement(vector),1);
    }

    @Test
    public void findMinElementTestIsValidSize() throws Exception {

        Vector vector = new Vector(2);
        vector.addElement(9);
        int expectedMin = 0;

        assertEquals(expectedMin, findMinElement(vector),1);
    }

    @Test
    public void findMinElementTest() throws Exception {

        Vector vector = new Vector(4);
        vector.addElement(9,3,2,1);
        int expectedMin = 0;

        assertEquals(expectedMin, findMinElement(vector),1);
    }

    @Test(expected=NullPointerException.class)
    public void findMaxElementIsNotValidSize() throws Exception {
        Vector vector = null;
        vector.addElement(9);
        int expectedMin = -1;

        assertEquals(expectedMin, findMaxElement(vector),1);
    }

    @Test
    public void findMaxElementIsValidSize() throws Exception {

        Vector vector = new Vector(2);
        vector.addElement(9);
        int expectedMin = 0;

        assertEquals(expectedMin, findMaxElement(vector),1);
    }

    @Test
    public void findMaxElementTest() throws Exception {

        Vector vector = new Vector(4);
        vector.addElement(9,3,2,1);
        int expectedMin = 9;

        assertEquals(expectedMin, findMaxElement(vector),1);
    }

    @Test
    public void findMaxElementIsElementILessThanMaxElement() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(9,3,2,1);
        vector.removeElement(0);
        int expectedMin = 3;

        assertEquals(expectedMin, findMaxElement(vector),1);
    }

    @Test
    public void findMaxElementIsElementIMoreThanMaxElement() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(0,3,2,1);
        vector.removeElement(0);
        int expectedMin = 3;

        assertEquals(expectedMin, findMaxElement(vector),1);
    }

///////////////////8 more to go////////////////////

    @Test
    public void findArithmeticAverage() throws Exception {
    }

    @Test
    public void findGeometricAverage() throws Exception {
    }

    @Test
    public void isAscending() throws Exception {
    }

    @Test
    public void isDescending() throws Exception {
    }

    @Test
    public void findLocalMinElementPosition() throws Exception {
    }

    @Test
    public void findLocalMaxElementPosition() throws Exception {
    }

    @Test
    public void hasElementLinearSearch() throws Exception {
    }

    @Test
    public void hasElementBinarySearch() throws Exception {
    }
/////////////
    @Test
    public void reverseVectorTest() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(3,2,1);
        reverseVector(vector);

        double[] expectedArray = {1,2,3};

        assertArrayEquals(expectedArray,vector.getVector(), 0.1);
    }

    @Test(expected=NullPointerException.class)
    public void reverseVectorTestVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3,2,1);
        reverseVector(vector);

        double[] expectedArray = {1,2,3};

        assertArrayEquals(expectedArray,vector.getVector(), 0.1);
    }

    @Test
    public void reverseVectorTestVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(4,3,2,1);
        reverseVector(vector);

        double[] expectedArray = {1,2,3,4};

        assertArrayEquals(expectedArray,vector.getVector(), 0.1);
    }

    @Test
    public void swapElementsTest() throws Exception {

        Vector vector = new Vector(0);
        double a = 13.13;
        double b = 12.12;
        vector.addElement(a,b);

        swapElements(vector,0,1);

        double expectedA = 12.12;

        assertEquals( expectedA , vector.getElement(0) , 0.1);

        }
    @Test
    public void swapElementsTestVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        double a = 14.13;
        double b = 13.12;
        vector.addElement(a,b);

        swapElements(vector,0,1);

        double expectedA = 13.12;

        assertEquals( expectedA , vector.getElement(0) , 0.1);

    }
    @Test(expected=NullPointerException.class)
    public void swapElementsTestVectorInvalidSize() throws Exception {

        Vector vector = null;
        double a = 13.13;
        double b = 12.12;
        vector.addElement(a,b);

        swapElements(vector,0,1);

        double expectedA = 12.12;

        assertEquals( expectedA , vector.getElement(0) , 0.1);

    }

}



