package classroom;

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

        // Exersice 8: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges.
        // Print the category based on the BMI. Formula: bmi = weight / (height * height);

        // Exercise 9: Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
        //If the average score is 90 or above, assign a grade of "A."
        //If the average score is between 80 and 89, assign a grade of "B."
        //If the average score is between 70 and 79, assign a grade of "C."
        //If the average score is between 60 and 69, assign a grade of "D."
        //If the average score is below 60, assign a grade of "F."
        int score = 90;
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
        // (check for method:
    }
}
