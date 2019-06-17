package by.epam.javatraining.shmarlouski.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is Vector class.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */

public class VectorTest {

    @Test
    public void addElementNull() throws Exception {

        double[] element = null;
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 3;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void addElementNotNull() throws Exception {

        double element = 1;
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 4;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void addElementLessThanZero() throws Exception {

        double element = -1;
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 3;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void addElementMany() throws Exception {

        double[] element = {3,2,1};
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 6;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void addElementManyWithNegative() throws Exception {

        double[] element = {3,2,-1};
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 3;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void addElementMoreThanZero() throws Exception {

        double element = 10;
        Vector vector = new Vector(3);
        vector.addElement(element);
        int lengthExpected = 4;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void removeElementIndexOutOfBound() throws Exception {

        int index = 10;
        Vector vector = new Vector(3);
        vector.removeElement(index);
        int lengthExpected = 3;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void removeElementIndexInBound() throws Exception {

        int index = 1;
        Vector vector = new Vector(3);
        vector.removeElement(index);
        int lengthExpected = 2;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void removeElementIndexLessThanZero() throws Exception {

        int index = -1;
        Vector vector = new Vector(3);
        vector.removeElement(index);
        int lengthExpected = 3;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void removeElementIndexMoreThanZero() throws Exception {

        int index = 2;
        Vector vector = new Vector(3);
        vector.removeElement(index);
        int lengthExpected = 2;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void removeElementIndexMoreIsZero() throws Exception {

        int index = 0;
        Vector vector = new Vector(3);
        vector.removeElement(index);
        int lengthExpected = 2;

        assertEquals(lengthExpected, vector.getLength());
    }

    @Test
    public void getElementIndexIsLessThanZero() throws Exception {

        int index = -1;
        Vector vector = new Vector(3);
        double expected = -1;

        assertEquals(expected, vector.getElement(index),1);
    }

    @Test
    public void getElementIndexIsMoreThanLength() throws Exception {

        int index = 4;
        Vector vector = new Vector(3);
        double expected = -1;

        assertEquals(expected, vector.getElement(index),1);
    }

    @Test
    public void getElementIndexIsLessThanLength() throws Exception {

        int index = 2;
        Vector vector = new Vector(3);
        double expected = 0.0;

        assertEquals(expected, vector.getElement(index),1);
    }

    @Test
    public void getElementIndexIsMoreThanZero() throws Exception {

        int index = 2;
        Vector vector = new Vector(3);
        double expected = 0.0;

        assertEquals(expected, vector.getElement(index),1);
    }

    @Test
    public void setElementIndexMoreThanZero() throws Exception {

        int index = 0;
        Vector vector = new Vector(3);
        double newElement = 1;
        vector.setElement(index,newElement);
        double expected = 1;

        assertEquals(expected, vector.getElement(index),0.1);
    }

    @Test
    public void setElementIndexLessThanZero () throws Exception {

        int index = -1;
        Vector vector = new Vector(3);
        double newElement = 1;
        vector.setElement(index,newElement);
        double expected = -1;

        assertEquals(expected, vector.getElement(index),0.1);
    }

    @Test
    public void setElementIndexMoreThanLength() throws Exception {

        int index = 5;
        Vector vector = new Vector(3);
        double newElement = 1;
        vector.setElement(index,newElement);
        double expected = -1;

        assertEquals(expected, vector.getElement(index),0.1);
    }

    @Test
    public void setElementIndexLessThanLength() throws Exception {

        int index = -10;
        Vector vector = new Vector(3);
        double newElement = 1;
        vector.setElement(index,newElement);
        double expected = -1;

        assertEquals(expected, vector.getElement(index),0.1);
    }

    @Test
    public void getLength() throws Exception {

        Vector vector = new Vector(2);
        int expected = 2;

        assertEquals(expected,vector.getLength());
    }

    @Test
    public void getVector() throws Exception {

        Vector vector = new Vector(2);
        double[] expectedArray = new double[2];

        assertArrayEquals(expectedArray,vector.getVector(),01);

    }

}