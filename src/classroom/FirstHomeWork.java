package classroom;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {

        // Exersice 1: Write a Java program that checks if a given number is positive.
        // If it is, print "Positive number."
        int x = 7;
        if (x > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not Positive");
        }

        // Exersice 2: Create a Java program that determines if a given integer is even.
        // If it is, print "Even number."
        int y = 4;
        if (y % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Not Even number");
        }

        // Exersice 3: Write a Java program that classifies a person into different age groups based on their age.
        // If the age is less than 18, print "Teenager," otherwise print "Adult."
        int age = 20;
        if (age < 18) {
            System.out.println("This is Teenager");
        } else if (age >= 18) {
            System.out.println("This is Adult");
        }

        // Exersice 4: Create a Java program that checks if a given year is a leap year.
        // If it is, print "Leap year."
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");;
        } else {
            System.out.println("Not Leap Year");;
        }

        // Exercise 5: Write a Java program that checks if a given number is positive, even, and less than 100.
        // If all conditions are true, print "Valid number."
        int num = 12;
        if (num > 0 && num % 2 == 0 && num < 100) {
            System.out.println("Valid number");
        } else {
            System.out.println("Not Valid Number");
        }

        // Exercise 6: Create a Java program that checks if a number is positive, and if so, check if it's even.
        // If both conditions are true, print "Positive and Even."
        int number = 50;
        if (number>0) {
            if (number % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Not Valid Number");
            }
        }

        // Exercise 7: Write a Java program that determines if a given character is a vowel.
        // If it is, print "Vowel." (Use variable with data type: char.
        // When checking character use == and ||)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a char: ");
        char ch = myScanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel " + ch);
        } else {
            System.out.println("Not a vowel " + ch);
        }

        // Exersice 8: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges.
        // Print the category based on the BMI. Formula: bmi = weight / (height * height);
        double weight = 90;
        double height = 1.78;
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("Normal weight");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("You are very FAT:)");
        }

        // Exercise 9: Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
        //If the average score is 90 or above, assign a grade of "A."
        //If the average score is between 80 and 89, assign a grade of "B."
        //If the average score is between 70 and 79, assign a grade of "C."
        //If the average score is between 60 and 69, assign a grade of "D."
        //If the average score is below 60, assign a grade of "F."
        Scanner sk = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = sk.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("F");
        }
        // Exercise 10: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf".
        // If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the file name with extension: ");
        String input = myScan.nextLine();
        if (input.endsWith(".txt") || input.endsWith(".doc") || input.endsWith(".pdf")) {
            System.out.println("Valid file extension! ");
        } else {
            System.out.println("Invalid file extension! ");
        }
    }
}
