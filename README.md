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

