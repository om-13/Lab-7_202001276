# Lab-7
# ID: 202001276
# NAME: OM CHALODIYA
# Section A
## Previous Date Problem

**Test Cases**
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



**Equivalence Class Partitions** <br/>
Day: 
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E1 | Between 1 and 31 | Valid |
| E2 | Less than 1 | Invalid |
| E3 | Greater than 31 | Invalid |

Month:
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E4 | Between 1 and 12 | Valid |
| E5 | Less than 1 | Invalid |
| E6 | Greater than 12 | Invalid |

Year: 
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E7 | Between 1900 and 2015 | Valid |
| E8 | Less than 1900 | Invalid |
| E9 | Greater than 2015 | Invalid |
