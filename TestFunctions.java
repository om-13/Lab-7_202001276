package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {

    @Test
    public void testLeapYear() {
        assertEquals("29/02/2004", UnitTest.findPreviousDate("01/03/2004"));
        assertEquals("28/02/2007", UnitTest.findPreviousDate("01/03/2007"));
        assertEquals("INVALID", UnitTest.findPreviousDate("29/02/2007"));
        assertEquals("INVALID", UnitTest.findPreviousDate("30/02/2004"));
    }
    
    @Test
    public void testNonLeapYear() {
        assertEquals("31/12/1899", UnitTest.findPreviousDate("01/01/1900"));
        assertEquals("30/12/2015", UnitTest.findPreviousDate("31/12/2015"));
        assertEquals("INVALID", UnitTest.findPreviousDate("31/12/1899"));
        assertEquals("INVALID", UnitTest.findPreviousDate("15/13/2000"));
        assertEquals("INVALID", UnitTest.findPreviousDate("32/06/2000"));
        assertEquals("14/06/2002", UnitTest.findPreviousDate("15/06/2002"));
    }
	
    @Test
    public void testLinearSearch() {
        int[] a1 = {2, 4, 6, 8, 10};
        int v1 = 6;
        assertEquals(2,  UnitTest.linearSearch(v1, a1));
        
        int[] a2 = {1, 3, 5, 7, 9};
        int v2 = 4;
        assertEquals(-1, UnitTest.linearSearch(v2, a2));
        
        int[] a3 = {};
        int v3 = 2;
        assertEquals(-1, UnitTest.linearSearch(v3, a3));
        
        int[] a4 = {2};
        int v4 = 2;
        assertEquals(0, UnitTest.linearSearch(v4, a4));
    }
    
    @Test
    public void testCountItem() {
        int[] a1 = {20, 40, 60, 80, 80};
        int v1 = 80;
        assertEquals(2, UnitTest.countItem(v1, a1));
        
        int[] a2 = {20, 40, 60, 80, 100};
        int v2 = 50;
        assertEquals(0, UnitTest.countItem(v2, a2));
        
        int[] a3 = {10, 10, 10};
        int v3 = 10;
        assertEquals(3, UnitTest.countItem(v3, a3));
        
        int[] a4 = {};
        int v4 = 10;
        assertEquals(0, UnitTest.countItem(v4, a4));
    }
    
    @Test
    public void testBinarySearch() {
        int[] a1 = {10, 20, 30, 40, 50};
        int v1 = 20;
        assertEquals(1, UnitTest.binarySearch(v1, a1));
        
        int[] a2 = {-20, -10, 0, 10, 20]};
        int v2 = 0;
        assertEquals(2, UnitTest.binarySearch(v2, a2));
        
        int[] a3 = {11, 22, 33, 44;
        int v3 = 55;
        assertEquals(-1, UnitTest.binarySearch(v3, a3));
        
        int[] a4 = {};
        int v4 = 5;
        assertEquals(-1, UnitTest.binarySearch(v4, a4));
        
        int[] a5 = {5};
        int v5 = 5;
        assertEquals(0, UnitTest.binarySearch(v5, a5));
        
        int[] a6 = {1,3};
        int v6 = 3;
        assertEquals(1, UnitTest.binarySearch(v6, a6));
    }
	
    @Test
    public void testTriangleInvalid() {
        assertEquals(3, UnitTest.triangle(0, 0, 0));
        assertEquals(3, UnitTest.triangle(-1, -1, -1));
        assertEquals(3, UnitTest.triangle(1, 2, 3);
    }
    
    @Test
    public void testTriangleEquilateral() {
        assertEquals(0, UnitTest.triangle(3, 3, 3));
    }
    
    @Test
    public void testTriangleIsosceles() {
        assertEquals(1, UnitTest.triangle(3, 1, 3));
        assertEquals(1, UnitTest.triangle(5, 5, 3));
        assertEquals(1, UnitTest.triangle(15, 10, 10));
    }
    
    @Test
    public void testTriangleScalene() {
        assertEquals(2, UnitTest.triangle(2, 3, 4));
    }
    
    @Test
    public void testPrefix() {
        assertTrue(UnitTest.prefix("", ""));
        assertTrue(UnitTest.prefix("om", "omchalodiya"));
        assertTrue(UnitTest.prefix("abcd", "abcd"));
        assertTrue(UnitTest.prefix("", "abc"));
        assertFalse(UnitTest.prefix("omchalodiya", "om"));
        assertFalse(UnitTest.prefix("abc", "abd"));
    }
}