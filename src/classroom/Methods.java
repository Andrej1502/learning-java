package classroom;

import java.lang.reflect.Array;

public class Methods {
    public static void main(String[] args) {

        calculateSum(44,20);
        System.out.println(calculateSum(44,20));

        // Print Hello World 10 times:
        printTextMultipleTimes("Hello,world!", 5);
        printTextMultipleTimes("Andrej", 5);

        String[] list = {"Banana", "Kiwi", "Pineple", "Mango"};
        printAllValuesFromStringArray(list);

        int[] numbers = {2,4,7,8,10};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);
    }

    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
           summa = summa + numbers[i];
        }
        return summa;
    }



    public static int calculateSum(int x, int y) {
        return x + y;

    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
        System.out.println(isEven(10));
    }
    // Task: create method that receives String array and print all values

    public static void printAllValuesFromStringArray (String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println(isEven(10));
    }
    // even ot not
    public static boolean isEven (int number) {
        boolean result = number % 2 == 0;
        return result;
        // return number % 2 == 0
    }



}
