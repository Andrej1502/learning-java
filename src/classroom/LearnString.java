package classroom;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Andrej";
        String lastName = "Gazin";

        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print name and Surname (Example: John Doe):
        // Concatination
        String fullName = name + " " + lastName; //Andrej Gazin
        System.out.println(fullName);
        // Same example
        System.out.println(name + " " + lastName);

        System.out.println(String.format("%s %s", name, lastName));

        //can save into variable
        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        //Hello World!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        // Exercise:
        // Step 1: Declare a string variable your name
        // Step 2: Declare a string variable with your favorite language
        // Step 3: Concatinate the two string to form message "My name is [name]. I love coding in [programming language]
        // Step 4: print it out

        String andrej = "Andrej";
        String programmingLanguage = "Java";
        String message = String.format("My name is %s. I love coding in %s.", andrej, programmingLanguage);
        System.out.println(message);

        String myName = "Andrej";
        String language = "Java";
        System.out.println("My name is" + myName + ", I love coding in " + language);

        String mName = "My name is Andrej. ";
        String java = "I love coding in Java";
        String myLove = mName.concat(java);
        System.out.println(myLove);

        String randomStrimg = "some text";
        System.out.println(randomStrimg.toUpperCase());
    }
}
