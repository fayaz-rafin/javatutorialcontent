# Week 3: Fruit Loops and Methods
This week, we will do a short review on Loops again and then introduce Arrays in Java.

## Review: For-Loops
```java
//How many times is the loop repeated?

for(int i = 0; i <=15; i+= 3){
  System.out.println(i);
  }

//How do we make a for-loop that increments the value by 1 i such that i = 10?

for(/*your code here*/){
  System.out.println(i);
  }
  ```
Q1. Write a method named `digitSum` in java that accepts an integer as a parameter and returns the sum of the digits of that number.

---

## Methods
In Java, a method is a block of code that performs a specific task and can be reused multiple times in a program. Methods allow you to break down complex logic into smaller, reusable parts and make your code more readable and organized.

Here's an example of a method in Java:
```java
public static int square(int number) {
    return number * number;
}
```
The method above takes an integer as input and returns its square.

In this example, the keyword public makes the method accessible from other classes. The keyword static allows the method to be called without creating an instance of the class. The keyword int specifies the return type of the method, which is an integer in this case. The method name is square and it accepts an integer parameter named number. The body of the method consists of a single statement, return number * number, which calculates and returns the square of the input number.

To call this method from another part of the code, you would write:
```java
int result = square(5);
System.out.println(result); // prints 25
```

