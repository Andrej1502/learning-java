package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        // Array
        // Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 5, 4};

        String[] seasons = {"Summer", "Winter", "Automn", "Spring"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        //print all grades
        System.out.println(Arrays.toString(grades));

        // Create epty array;
        int[] emptyArray = new int[4];
        // [0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        // Create String array with names;
        // Name count should be 5;
        // And print them all;
        String[] names = {"Andrej", "Marina", "Mila", "Njusha", "Zhora"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(Arrays.toString(names));

        // Create empty Array
        double[] empty = new double[5];
        System.out.println(Arrays.toString(empty));
        empty[0] = 3.14;
        empty[1] = 5.50;
        empty[2] = 1.11;
        empty[3] = 6.66;
        empty[4] = 5.35;
        System.out.println(Arrays.toString(empty));

        // Print numbers from 0 to 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate sum from 1 to 100;
        int summa = 0;
        for (int i = 1; i <=100 ; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        //  for ->

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        for (String s : shoppingList) {
            System.out.println(s);
        }

        // i = 0;
        // check: if i < shoppingList.length;
        // i = i + i;

        // Print numbers from 10 to 0;

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >=0) {
            System.out.println(counter);
            counter = counter - 1;
        }
           for (int i = 2; i <= 100; i = i + 2 ) {
               System.out.println(i + " ");
        }
        System.out.print(" ");

           for (int i = 2; i <= 100; i++) {
               if (i % 2 == 0) {
                   System.out.print(i + " ");
               }
        }
    }
}
