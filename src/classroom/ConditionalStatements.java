package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Conditional Statement is Java allow the flow of your program based on certain
        // conditions.

        // "if" statement

        /*
        if(conditions) {
        // Code to be executed if the condition is true!
        }
         */

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is spring");
        }

        // What returns true or false
        // Comparison: >, <, ==, >=, <=, !=

        // IF-ELSE

        // Child: <= 12 age;
        // Teenager: >= 13 age;
        // Adult: => 20 & <= 59;
        // ELSE: Senior

        int age = 25;

        if (age <=12) {
            System.out.println("This is child");
        } else  {
            System.out.println("Something else");
        }

        // if else-if else

        if (age <= 12) {
            System.out.println("This is child!");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        }
        else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        }
        else {
            System.out.println("This is senior!");
        }

        // Write a Java program that checks if a given number is positive,negative or zero.
        // Step 1: define variable (int number = 10);
        // Step 2: create logic
        // Step 3: For each condition print out message(is positive, is negative, is zero);

        int num = 10;

        if (num == 0) {
            System.out.println("This is 0");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0) {
            System.out.println("Positive");
        }

        // Write a Java program that determines the time of day based on given hour:
        // If the hour is between 0 and 11 will print: Good morning;
        // If the hour is between 12 and 17, will print: Good afternoon;
        // If the hour is between 18 and 23, will print: Good evening;
        // In all other cases should say: Invalid hour provided;

        int hour = 40;

        if (hour >= 0 && hour<=11) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon!");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Invalid hour provided! " + hour);
        }

    }
}
