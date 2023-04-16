# Lab-7
# ID: 202001276
# NAME: OM CHALODIYA
# Section A
## Previous Date Problem

### **Test Cases**
| Test Case ID | Day | Month | Year | Expected Output |
| -------------|-----|-------|------|-----------------|
| 1 | 15 | 6 | 2000 | 14-6-2000 |
| 2 | 1 | 1 | 1900 | 31-12-1899 |
| 3 | 31 | 12 | 2015 | 30-12-2015 |
| 4 | 29 | 2 | 2012 | 28-2-2012 (leap year)|
| 5 | 29 | 2 | 2011 | Invalid (not leap year)|
| 6 | 32 | 6 | 2000 | Invalid |
| 7 | 15 | 13 | 2000 | Invalid |
| 8 | 15 | 6 | 2016 | Invalid |
| 9 | 32 | 13 | 2000 | Invalid |
| 10 | 32 | 6 | 2016 | Invalid | 
| 11 | 15 | 13 | 2016 | Invalid |

### **Equivalence Class Partitions** </br>
**Day:**
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E1 | Between 1 and 31 | Valid |
| E2 | Less than 1 | Invalid |
| E3 | Greater than 31 | Invalid |

**Month:**
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E4 | Between 1 and 12 | Valid |
| E5 | Less than 1 | Invalid |
| E6 | Greater than 12 | Invalid |

**Year:** 
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E7 | Between 1900 and 2015 | Valid |
| E8 | Less than 1900 | Invalid |
| E9 | Greater than 2015 | Invalid |

**JUnit Testing Code** <br/>

```ruby
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
}
```
**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231760083-ab16aa08-3513-4051-a6c4-4cccacaa49b0.png)

## Program 1
**Equivalence class partitioning for linear search**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| [2, 4, 6, 8, 10], v = 6 | 2 |
| [1, 3, 5, 7, 9], v = 4 | -1 |
| [2, 4, 6, 8, 10], v = 11 | -1 |
| [], v = 2 | -1 |
| NULL, v = 2 | -1 |

**Boundary value analysis**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| NULL, v = 5 | -1 |
| [], v = 5 | -1 |
| [5], v = 5 | 0 |
| [5], v = 3 | -1 |
| [3, 5], v = 3 | 0 |
| [3, 5], v = 5 | 1 |
| [3, 5], v = 4 | -1 |
| [1, 3, 5], v = 1 | 0 |
| [1, 3, 5], v = 5 | 2 |
| [1, 3, 5], v = 7 | -1 |
|[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1], v = 1| 0 |
|[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11], v = 11| 10 |
|[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1], v = 11| -1 |

**JUnit Testing Code** <br/>
```ruby
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {
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
}

```

**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231767489-bc9ee281-63a7-4084-af25-e6ad8e27d7ec.png)

## Program 2
**Equivalence class partitioning for counting occurance**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| [20, 40, 60, 80, 100], v = 100 | 1 |
| [20, 40, 60, 80, 80], v = 80 | 2 |
| [20, 40, 60, 80, 100], v = 50 | 0 |
| [10, 10, 10, 10], v = 50 | 0 |
| [], v = 50 | 0 |
| NULL, v = 100 | 0 |
| [0], v = 0 | 1 |
| [-10, -10], v = -10 | 2 |

**Boundary value analysis**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| [1, 2, 2, 3], v = 2 | 2 |
| [10, 15, 15, 15], v = 15 | 3 |
| [], v = 50 | 0 | 
| NULL, v = 100 | 0 |
| [10, 10, 10, 10], v = 100| 0 |
| [-10, 10], v = 10 | 1 |
| [-100, 100], v = -100 | 1 |

**JUnit Testing Code** <br/>
```ruby
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {
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
}
```

**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231772483-637297a5-e007-41e3-bce9-fdca42f75c10.png)

## Program 3
**Equivalence class partitioning for binary search:**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| [10, 20, 30, 40, 50], v = 20 | 1 |
| [10, 20, 30, 40, 50, 60], v = 30 | 2 |
| [10, 100, 1000, 10000], v = 100000 | -1 |
| [11, 22, 33, 44], v = 55 | -1 |
| [100, 200, 300, 400], v = 100 | 0 |
| [-20, -10, 0, 10, 20], v = 0 | 2 |
| [], v = 5 | -1 |
| NULL, v = 10 | -1 |
| [1, 3], v = 2 | -1 |
| [1, 3], v = 3 | 1 |

**Boundary value analysis**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| [1, 2, 2, 3], v = 2 | 1 |
| [1, 2, 2, 2, 3], v = 2 | 2 |
| [10, 20, 30, 40, 50], v = 60 | -1 |
| [2, 4, 6, 8, 10], v = 5 | -1 |
| [-10, 0, 10], v = -10 | 0 |
| [-10, 0, 10], v = 10 | 2 |
| [], v = 50 | -1 |
| NULL, v = 100 | -1 |

**JUnit Testing Code** <br/>
```ruby
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {
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
}
```
**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231779493-081afec2-4ac0-4401-891d-1e334991dc7f.png)

## Program 4
**Equivalence class partitioning for checking the type of triangle**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| a=1, b=1, c=1 | EQUILATERAL |
| a=3, b=3, c=3 | EQUILATERAL |
| a=0, b=0, c=0 | INVALID |
| a=-1, b=-1, c=-1 | INVALID |
| a=3, b=1, c=3 | ISOCELES |
| a=5, b=5, c=3 | ISOCELES |
| a=5, b=5, c=0 | INVALID |
| a=2, b=3, c=4 | SCALENE |
| a=6, b=10, c=15 | SCALENE |
| a=5, b=10, c=15 | INVALID |
| a=-2, b=3, c=4 | INVALID |

**Boundary value analysis**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| a=3, b=3, c=3 | EQUILATERAL |
| a=0, b=0, c=0 | INVALID |
| a=INT_MAX, b=INT_MAX, c=INT_MAX | EQUILATERAL |
| a=INT_MIN, b=INT_MIN, c=INT_MIN | INVALID |
| a=10, b=10, c=15 | ISOCELES |
| a=5, b=5, c=10 | INVALID |
| a=INT_MAX, b=1, c=INT_MAX | ISOCELES |
| a=2, b=3, c=4 | SCALENE |
| a=INT_MAX, b=1, c=INT_MAX-1 | INVALID |

**JUnit Testing Code** <br/>
```ruby
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {
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
}
```
**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231783233-2e58f5e7-e5ae-4f2c-8d73-97f0fb98d002.png)

## Program 5
**Equivalence class partitioning for prefix searching**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| s1 = "abcd", s2 = "abcd" | true |
| s1 = "", s2 = "" | true |
| s1 = "om", s2 = "omchalodiya" | true |
| s1 = "omchalodiya", s2 = "om" | false |
| s1 = "abc", s2 = "" | false |
| s1 = "", s2 = "abc" | true |
| s1 = "ab", s2 = "abcd" | true |
| s1 = "cd", s2 = "abcd" | false |
| s1 = "abc", s2 = "abd" | false |

**Boundary value analysis**
| Tester Action and Input Data | Expected Outcome |
|------------------------------|------------------|
| s1 = "abcd", s2 = "abcd" | true |
| s1 = "", s2 = "" | true |
| s1 = "abc", s2 = "" | false |
| s1 = "", s2 = "abc" | true |
| s1 = "ab", s2 = "abba" | true |
| s1 = "abc", s2 = "abd" | false |
| s1 = "om", s2 = "omchalodiya" | true |
| s1 = "om", s2 = "chalodiya" | false |

**JUnit Testing Code** <br/>
```ruby
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {
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
```
**JUnit Testing Output** <br/>

![image](https://user-images.githubusercontent.com/77292724/231787027-d44b327a-823c-4f82-b059-4a83a37e180e.png)

## Program 6

**A. Equivalence classes for the system**

The possible equivalence classes and their corresponding conditions are as follows:

| Equivalence Class    | Necessary Condition                                  |
| -------------------- | ----------------------------------------------------- |
| Invalid Triangle     | A > B + C or B > A + C or C > A + B                         |
| Scalene Triangle     | A != B and B != C and C != A                          |
| Isoceles Triangle    | either A == B or B == C or A == C                     |
| Equilateral Triangle | A == B and B == C                                     |
| Right-angle Triangle | A^2 + B^2 = C^2 or A^2 = B^2 + C^2 or B^2 + A^2 = C^2 |

**B. Test Cases for Equivalence Classes**

Following are list of test cases each belonging to one of the defined Equivalence class

| Test Case | Condition           | Expected Outcome     |
| --------- | ------------------- | -------------------- |
| 1         | A = 3, B = 3, C = 3 | Equilateral Triangle |
| 2         | A = 5, B = 12, C = 13 | Right-angle Triangle |
| 3         | A = 3, B = 3, C = 4 | Isosceles Triangle   |
| 4         | A = 2, B = 3, C = 4 | Scalene Triangle     |
| 5         | A = 1, B = 2, C = 3 | Invalid Triangle     |

**C. Boundary Condition $A + B > C$ (scalene triangle)**

Below is the list of possible corner cases looking like scalene triangle but are not

| Test Case | Condition                 | Expected Outcome |
| --------- | ------------------------- | ---------------- |
| 1         | A = 2, B = 1, C = 3       | Invalid Triangle |
| 2         | A = 1, B = 2, C = 4       | Invalid Triangle |
| 3         | A = 2, B = 2, C = 5       | Invalid Triangle |
| 4         | A = 0.1, B = 0.2, C = 0.3 | Invalid Triangle |
| 5         | A = 1, B = 2, C = 2.5     | Scalene Triangle |

**D. Boundary Condition $A = C$ (isosceles triangle)**

Below is the list of possible corner cases looking like isosceles triangle but are not

| Test Case | Condition                   | Expected Outcome   |
| --------- | --------------------------- | ------------------ |
| 1         | A = -3, B = 2, C = -3       | Invalid Triangle   |
| 2         | A = 1, B = 2, C = 1         | Invalid Triangle   |
| 3         | A = 1, B = 3, C = 1         | Invalid Triangle   |
| 4         | A = 0.1, B = 0.3, C = 0.1   | Invalid Triangle   |
| 5         | A = 0.15, B = 0.25, C = 0.15 | Isosceles Triangle |

**E. Boundary Condition $A = B = C$ (equilateral triangle)**

Below is the list of possible corner cases looking like isosceles triangle but are not

| Test Case | Condition                 | Expected Outcome     |
| --------- | ------------------------- | -------------------- |
| 1         | A = -3, B = -3, C = -3    | Invalid Triangle     |
| 2         | A = 0, B = 0, C = 0       | Invalid Triangle     |
| 3         | A = 3, B = 3, C = 3    | Equilateral Triangle |
| 4         | A = 0.5, B = 0.5, C = 0.5 | Equilateral Triangle |

**F. Boundary Condition $A^2 + B^2 = C^2$ (right-angle triangle)**

Below is the list of possible corner cases looking like right-angle triangle but are not

| Test Case | Condition                    | Expected Outcome      |
| --------- | ---------------------------- | --------------------- |
| 1         | A = 5, B = 12, C = 13          | Right Angled Triangle |
| 2         | A = -4, B = -3, C = 5        | Invalid Triangle      |
| 3         | A = -1, B = -1.414, C = 1.73 | Invalid Triangle      |
| 3         | A = 1, B = 1.414, C = 1.73   | Right Angled Triangle |

**G. Non-triangle Case**

Below is the list of possible Invalid Triangle cases

| Test Case | Condition                    | Expected Outcome |
| --------- | ---------------------------- | ---------------- |
| 1         | A = 3, B = 4, C = 9          | Invalid Triangle |
| 2         | A = -4, B = -2, C = 5        | Invalid Triangle |
| 3         | A = -1, B = -1, C = -1 | Invalid Triangle |
| 4         | A = 111, B = 1.414, C = 9.73 | Invalid Triangle |
| 5         | A = 1, B = 53, C = 9.73      | Invalid Triangle |
| 6         | A = 1, B = 1.414, C = -9.73  | Invalid Triangle |
| 7         | A = 0, B = 0, C = 0          | Invalid Triangle |

**H. Non-positive Input**

Below is the list of possible Invalid Triangle cases

| Test Case | Condition        | Expected Outcome |
| --------- | ---------------- | ---------------- |
| 1         | a = -1, b = 2, c = 1   | Invalid Triangle |
| 2         | a = -4, b = -5, c = -7 | Invalid Triangle |
| 3         | a = 1, b = -5, c = 7  | Invalid Triangle |

---
