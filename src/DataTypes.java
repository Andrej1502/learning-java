public class DataTypes {
    public static void main(String[] args) {
        // first comment
        /*  */

        //Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //char
        char symbol = '$';
        System.out.println(symbol);

        //exercise
        char a = 65;
        System.out.println(a);
        char n = 110;
        System.out.println(n);
        char d = 100;
        System.out.println(d);
        char r = 114;
        System.out.println(r);
        char e = 101;
        System.out.println(e);
        char j = 106;
        System.out.println(j);

        //Boolean is / has
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
    }
}
