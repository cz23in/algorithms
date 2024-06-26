# Report for Assignment 1

## Project chosen

Name: Java Algorithms

URL: (Our own) https://github.com/cz23in/algorithms (Original) https://github.com/TheAlgorithms/Java

Number of lines of code and the tool used to count it: 40601 counted with CLOC

Programming language: Java

## Coverage measurement

### Existing tool

The existing tool that was executed is JaCoCo. It was executed using Maven with the following command:
```sh
mvn clean test jacoco:report
```


the coverage results provided by the existing tool is generated in the target/site/jacoco directory.
![](coverage_screenshots/jacoco.jpg)


### Your own coverage tool

#### Adam Atchia

**Function 1 name:** ```UnionFind.union```

[Function 1 commit](https://github.com/cz23in/algorithms/commit/edb11906d30e593c1f0e19ac5f7192e9107e5c61)

![](coverage_screenshots/Adam/adam_own_tool_function_1.png)

**Function 2 name:** ```NextSmallerElement.findNextSmallerElements```

[Function 2 commit](https://github.com/cz23in/algorithms/commit/d7648dcc9e7969a5000e19f8e5c5308e34ccc59a)

![](coverage_screenshots/Adam/adam_own_tool_function_2.png)

### Rui Gao

**Function 1 name:** ```findKthMax```

[Function 1 commit](https://github.com/cz23in/algorithms/commit/28ed48d52d7253c67a2eb2cabfb395d8b56355de#diff-da29792920db2b60923338a5dfb1aa3ffc49101330eeec20554be3f4cfcf8735
)
<p align="left">
  <img src="coverage_screenshots/Rui/Rui_function1.jpg" alt="Description of the image">
</p>

**Function 2 name:** ```partition```

[Function 2 commit](https://github.com/cz23in/algorithms/commit/715b924ffc16042cfdb923cd9af57a175c8fccc4#diff-da29792920db2b60923338a5dfb1aa3ffc49101330eeec20554be3f4cfcf8735)
<p align="left">
  <img src="coverage_screenshots/Rui/Rui_function2.jpg" alt="Description of the image">
</p>

### Ciaran Edmundson

**Function 1 name:** ```isVampireNumber```

[Function 1 commit](https://github.com/cz23in/algorithms/commit/3fa27f267f77cb0c682ac41743f391970dd958fa)

<p align="left">
  <img src="coverage_screenshots/Ciaran/isVampire.png" alt="Description of the image">
</p>

**Function 2 name:** ```splitIntoDigits```

[Function 2 commit](https://github.com/cz23in/algorithms/commit/3fa27f267f77cb0c682ac41743f391970dd958fa)
<p align="left">
  <img src="coverage_screenshots/Ciaran/splitDigits.png" alt="Description of the image">
</p>

### Xueqi Zhang

**Function 1 name:** ```isKeith```

[Function 1 commit](https://github.com/cz23in/algorithms/commit/dddcef57e62ab9909a1361555f40260343cac512)
<p align="left">
  <img src="coverage_screenshots/Xueqi/Xueqi_function1.png">
</p>

**Function 2 name:** ```minimumCoins```

[Function 2 commit](https://github.com/cz23in/algorithms/commit/82ff03a2379a33de2c6e7c7fb58a4a29a4ab39cb)
<p align="left">
  <img src="coverage_screenshots/Xueqi/Xueqi_function2.png" alt="Description of the image">
</p>


## Coverage improvement

### Individual tests
#### Adam Atchia

Test 1: ```UnionFind.union```

[Test 1 commit](https://github.com/cz23in/algorithms/commit/2b06f4043370ff777fa9b1e55df55761c4f412c5)

Before:
![](coverage_screenshots/Adam/adam_improvement_function_1_before.png)

After:
![](coverage_screenshots/Adam/adam_improvement_function_1_after.png)

The initial coverage was 0% given that a test did not previously exist. After implementing a test, the coverage has been significantly increased to 100% across most functions.

Test 2: ```NextSmallerElement.findNextSmallerElements```

[Test 2 commit](https://github.com/cz23in/algorithms/commit/6699363f58cc2be2a44d61c439f9e2f0110f6139)

Before:
![](coverage_screenshots/Adam/adam_improvement_function_2_before.png)

After:
![](coverage_screenshots/Adam/adam_improvement_function_2_after.png)

The initial coverage was 0% given that a test did not previously exist. After implementing a test, the coverage has been significantly increased to 100% across most functions.
### Rui Gao

**Test 1:** ```findKthMax```

[Test 1 commit](https://github.com/cz23in/algorithms/commit/bdfeed89be8b4cd83bf16d55ae7e3df51ad87d3b#diff-7f9d72a70005fcd19f4aff8afc3f568d6004e859b926c528181e9e9cc23c3f52)
<p align="left">
  <img src="coverage_screenshots/Rui/old_coverage_results_FKN.jpg" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Rui/new_coverage_results_FKN.jpg" alt="screenshot of the new coverage results">
</p>

The initial branch coverage was 0%, since there were no tests. After adding new test cases, the branch coverage of `findKthNumber` function is 100%.

`findKthMax` Method Branches:
1. **While Loop**:
    - The while loop is covered by all test cases that call `findKthMax` with a non-empty array.

2. **If Conditions**:
    - `if (k == pivot)`: Covered by `testFindKthMax_KEqualPivot_ReturnResult` where `k` equals the pivot index.
    - `else if (k > pivot)`: Covered by `testFindKthMax_KGreaterThanPivot_UpdatesStart` where `k` is greater than the pivot index.
    - `else`: Covered by `testFindKthMax_KLessThanPivot_UpdatesEnd` where `k` is less than the pivot index.

3. **Edge Cases**:
    - Negative `k`: Covered by `testFindKthMax_KOutOfBoundsNegative_ReturnsNegativeOne`.
    - `k` out of bounds: Covered by `testFindKthMax_KOutOfBoundsGreaterThanLength_ReturnsNegativeOne`.
    - Empty array: Covered by `testFindKthMax_EmptyArray_ReturnsNegativeOne`.
    - Single element: Covered by `testFindKthMax_SingleElementArray_ReturnsElement`.

**Test 2:** ```partition```

[Test 2 commit](https://github.com/cz23in/algorithms/commit/73176bb742580da64c740d725919cfa8c68feb81)
<p align="left">
  <img src="coverage_screenshots/Rui/old_coverage_results_FKN.jpg" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Rui/new_coverage_results_FKN.jpg" alt="screenshot of the new coverage results">
</p>

The initial branch coverage was 0%, since there were no tests. After adding new test cases, the branch coverage of `partition` function is 100%.

`partition` Method Branches:
1. **For Loop**:
    - The for loop is covered by `testPartition_ValidArray_CorrectPartitioning`.

2. **If Condition**:
    - `if (nums[i] < pivot)`: Covered by the same test case, ensuring the partition logic is validated.


### Ciaran Edmundson

**Test 1:** ```isVampireNumber```

[Test 1 commit](https://github.com/cz23in/algorithms/commit/9dec24942ae6bf86262d8b731bfd891427943140)
<p align="left">
  <img src="coverage_screenshots/Ciaran/beforeChanges.png" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Ciaran/afterChanges.png" alt="screenshot of the new coverage results">
</p>

There was no branch coverage as there were no automated test cases. After adding new cases, the branch coverage of `isVampireNumber` function shows as 83%.

`isVampireNumber` Method Branches:
1. **First if Condition** (`noPseudoVamireNumbers`):

This branch is covered by the `testIsVampireNumber_NoPseudoVampireNumbers_True` and `testIsVampireNumber_NoPseudoVampireNumbers_False` test cases.

2. **Second if Condition** `(a * 10 <= b || b * 10 <= a)`:

This branch is specifically covered by the `testIsVampireNumber_HitInnerIf` test case, which provides inputs that satisfy the condition `a * 10 <= b || b * 10 <= a`.

3. **Return true/false:**

The return paths are validated by multiple test cases, ensuring both true and false results are handled correctly:
`testIsVampireNumber_False`
`testIsVampireNumber_NoPseudoVampireNumbers_True`
`testIsVampireNumber_NoPseudoVampireNumbers_False`
`testIsVampireNumber_HitInnerIf`

**Test 2:** ```splitIntoDigits```

[Test 2 commit](https://github.com/cz23in/algorithms/commit/9dec24942ae6bf86262d8b731bfd891427943140)
<p align="left">
  <img src="coverage_screenshots/Ciaran/beforeChanges.png" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Ciaran/afterChanges.png" alt="screenshot of the new coverage results">
</p>

There was no branch coverage as there were no automated test cases. After adding new cases, the branch coverage of `splitIntoDigits` function shows as 100%.

`splitIntoDigits` Method Branches:
1. **While Loops** `(while num > 0 and while num2 > 0)`:

The loops are covered by the `testSplitIntoDigits` test case

2. **Extra** 
All test cases for isVampireNumber except `testIsVampireNumber_HitInnerIf` cover this function as well, as it calls it.


### Xueqi Zhang

**Test 1:** ```KeithNumberTest```

[Test 1 commit](https://github.com/cz23in/algorithms/commit/bdfeed89be8b4cd83bf16d55ae7e3df51ad87d3b#diff-7f9d72a70005fcd19f4aff8afc3f568d6004e859b926c528181e9e9cc23c3f52)
<p align="left">
  <img src="coverage_screenshots/Xueqi/Function1_before.png" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Xueqi/Function1_after.png" alt="screenshot of the new coverage results">
</p>

The initial branch coverage was 0%, so there was no tests inside thie function. The structure of this function is not complex，so after adding new test cases, the branch coverage became 100%.

`KeithNumberTest` :
1. **Basic coverage tests for the loops**:
    - Since this method is a standalone method for determining whether a number is a KeithNumber, I chose to use different inputs to see if the test could achieve full coverage under different input scenarios. Just as the results shows, the while loops and the for loop is covered by all test cases.
    - 
2. **Coverage test for the if statements**:
    - `if.1`: Covered by all the cases the input is a Keith Number.
    - `else.1`: Covered by all the cases the input is a Keith Number.

3. **Edge Cases**:
    - No matter input is a large number, signed number, it does not change the coverage.

**Test 2:** ```minimumCoinsTest```

[Test 2 commit](https://github.com/cz23in/algorithms/commit/82ff03a2379a33de2c6e7c7fb58a4a29a4ab39cb)
<p align="left">
  <img src="coverage_screenshots/Xueqi/Function2_before.png" alt="screenshot of the old coverage results">
</p>
<p align="left">
  <img src="coverage_screenshots/Xueqi/Function2_after.png" alt="screenshot of the new coverage results">
</p>

The initial branch coverage was 0%, there were no tests for this function. After adding new test cases, the branch coverage of `minimumCoins` function is 100%.

`minimumCoins` Method Branches:
1. **Basic coverage tests for the loops**:
    - This method is also a standalone method for calculation, so I still use different inputs to see if the test could achieve full coverage under different input scenarios. Just as the results shows, the three for loops is covered by all test cases.

2. **Coverage test for the inner if statements**:
    - `if.1`: Covered by the same test case, ensuring the partition logic is validated.
    - `if.2`: Covered by the same test case, ensuring the partition logic is validated.
      
3. **Edge Cases**:
    - In this case, egde cases can be when there is no result for the calculation (output zero) or there are less than 3 inputs. There are 3 methods for test edge cases, and just as the results shows, they does not change the coverage.


### Overall

Screenshot of the old coverage results by running JaCoCo
![](coverage_screenshots/jacoco.jpg)
Screenshot of the new coverage results by running JaCoCo using all test modifications made by the group
![](coverage_screenshots/Rui/overall_new_coverage_results_FKN.jpg)

## Statement of individual contributions
**Adam Atchia**
1. I contributed by furfilling my portion of the assignment for functions UnionFind.union and NextSmallerElement. 
2. I developed my own coverage tool and framework for reusable coverage maps, as well as improved the test cases which did not previously exist for the two functions.

**Rui Gao**
1. Find projects:
   - Found few projects that meet the requirements, but we did not choose them in the end.
2. Coverage Measurement:
   - Using existing tool JaCoCo to show the overall coverage results.
3. Branch Coverage Instrumentation:
   - Added branch coverage instrumentation to the `FindKthNumber` class, by using `Map` interface and put a flag (a boolean value in this case) in each branch to ensure all branches were tracked for function `findKthMax` and `partition`.
4. Test Case Development:
   - Created a test file `FindKthNumerTest` to ensure branches within the `findKthMax` and `partition` functions were covered.

**Ciaran Edmundson**
1. Branch Coverage Instrumentation: 
   - Added branch coverage instrumentation to the VampireNumber class. I added a `coverageMap` datastructure and 2 functions`printCoverage()`, `resetCoverage()` to ensure all branches were tracked.
2. Test Case Development: 
   - Created test cases to ensure branches within the `isVampireNumber` and `splitIntoDigits` functions were covered.
3. Coverage Reporting: 
   - Implemented functions to print and reset coverage, to ensure the map is reset between each test. (other team members did it differently)
4. Existing Coverage Tool
   - I initially experimented with Intellij's built in coverage tool, which doesn't show branch coverage by default so I had to figure that out. I then switched to Jacoco as it shows individual function coverage compared to Intellij's

**Xueqi Zhang**

1. Branch Coverage Measurement:
   - Also Used the existing tool JaCoCo to show the overall coverage results.Branch Coverage Instrumentation:
2. Branch Coverage Instrumentation:
   - Added branch coverage instrumentation to the KeithNumber and MinimumCoins classes. Introduced a coverageMap datastructure along with two functions, printCoverage() and resetCoverage(), to track all branches accurately.
3. Test Case Development:
   - Developed comprehensive test cases for the isKeithNumber and calculateMinimumCoins functions to ensure full branch coverage. Created KeithNumberTest and MinimumCoinsTest classes for testing.
