package homework;

public class PlayPezDispenser {
    public static void main(String[] args) {

        PezDispenser marvel = new PezDispenser("green", "Hulk");
        System.out.println(marvel.getModelName());
        System.out.println(marvel.getColor());
        System.out.println(marvel);

        marvel.push();
        marvel.push();
        marvel.push();
        marvel.push();
        marvel.push();
        marvel.push();
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUp();
        System.out.println(marvel.getCurrentQuantity());

        marvel.push(11);

        marvel.push(6);
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUp();
        System.out.println(marvel.getCurrentQuantity());

        marvel.push(4);
        marvel.push(4);
        marvel.push(4);
        marvel.push(4);
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUp(5);
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUp();
        System.out.println(marvel.getCurrentQuantity());

        marvel.push();
        marvel.push(2);
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUpOneCandy();
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUp();
        System.out.println(marvel.getCurrentQuantity());

        marvel.fillUpOneCandy();
        
    }
}
