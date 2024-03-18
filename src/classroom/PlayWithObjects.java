package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(1);
        barsik.setColor("gray");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(2);
        leo.setColor("ginger");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        Animal njusha = new Animal();
        System.out.println(njusha.getName());
        njusha.setName("Njusha");
        njusha.setAge(3);
        njusha.setColor("White");
        System.out.println(njusha.getName());

        njusha.walk();
        njusha.eat();

        Animal djoma = new Animal();
        System.out.println(djoma.getName());
        djoma.setName("Djoma");
        djoma.setAge(2);
        djoma.setColor("black");

        djoma.walk();
        djoma.eat();
    }
}
