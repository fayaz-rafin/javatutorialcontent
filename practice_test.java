import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Suppose income is 4001, what is the output of the following code?
        int income = 4001;

        if (income > 3000) {
            System.out.println("Income is greater than 3000");
        }
        else if (income > 4000) {
            System.out.println("Income is greater than 4000");
        }

        //2. Suppose x = 1, y = -1, and z = 1. What is the output of the following statement?
        int x = 1, y = -1, z = 1;

        if (x > 0)
            if (y > 0)
                System.out.println("x > 0 and y > 0");
            else if (z > 0)
                System.out.println("x < 0 and z > 0");

        //3. Which of the following is a possible output from invoking Math.random()?
        /*
        a. 3.43
        b. 0.5
        c. 0.0
        d. 1.0
         */

        //4. To check whether a char variable ch is an uppercase letter, you write ___________.
        /*
        a. (ch >= 'A' && ch >= 'Z')
        b. (ch >= 'A' && ch <= 'Z')
        c. (ch >= 'A' || ch <= 'Z')
        d. ('A' <= ch <= 'Z')
         */

        //5. How many times will the following code print "Welcome to Java"?
        int count = 0;
        while (count++ < 10) {
            System.out.println("Welcome to Java");
        }

        //6. What will be displayed when the following code is executed?
        int number = 6;
        while (number > 0) {
            number -= 3;
            System.out.print(number + " ");
        }

        //7. Which of the following loops correctly computes 1/2 + 2/3 + 3/4 + ... + 99/100?
//        A:
//        double sum = 0;
//        for (int i = 1; i <= 99; i++) {
//            sum = i / (i + 1);
//        }
//        System.out.println("Sum is " + sum);
//
//        B:
//        double sum = 0;
//        for (int i = 1; i < 99; i++) {
//            sum += i / (i + 1);
//        }
//        System.out.println("Sum is " + sum);
//
//        C:
//        double sum = 0;
//        for (int i = 1; i <= 99; i++) {
//            sum += 1.0 * i / (i + 1);
//        }
//        System.out.println("Sum is " + sum);
//
//        D:
//        double sum = 0;
//        for (int i = 1; i <= 99; i++) {
//            sum += i / (i + 1.0);
//        }
//        System.out.println("Sum is " + sum);
//
//        E:
//        double sum = 0;
//        for (int i = 1; i < 99; i++) {
//            sum += i / (i + 1.0);
//        }
//        System.out.println("Sum is " + sum);

        //8. Suppose the input for number is 9. What is the output from running the following program?
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int i;
        boolean isPrime = true;
        for (i = 2; i < num && isPrime; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        System.out.println("i is " + i);
        if (isPrime)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");

        //9. Write the value returned for the method calls below:
        /*
        Method Call    Value Returned
        mystery(-5)   :
        mystery(0)    :
        mystery(7)    :
        mystery(18)   :
        mystery(49)   :
        */

        //10. What is the output of the following program?
        String str1 = "Hello";
        String str2 = "York Students";
        String s1 = nosense(str1, str2);
        System.out.println(s1 + " " + str2);
    }

    //9.
    public static int mystery(int n) {
        if (n < 0) {
            n = n * 3;
            return n;
        } else {
            n = n + 3;
        }
        if (n % 2 == 1) {
            n = n + n % 10;
        }
        return n;
    }

    //10.
    private static String nosense(String s1, String s2) {
        String result = s2.substring(s2.length() - 5);
        s2 = "" + s2.charAt(s1.length());
        s1 = s1.substring(2);
        result += s2 + s1;
        return result;
    }
}
