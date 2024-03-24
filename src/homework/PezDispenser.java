package homework;

public class PezDispenser {

    private String color;
    private String modelName;
    private final int maxQuantity = 10;
    private int currentQuantity;

    public PezDispenser(String color, String modelName) {
        this.color = color;
        this.modelName = modelName;
        this.currentQuantity = maxQuantity;
    }

    public PezDispenser() {
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "color='" + color + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public void push() {
        if (currentQuantity <= 0) {
            System.out.println("I am empty, please fill me up!");
        } else {
            System.out.println("Eat me");
            currentQuantity = currentQuantity - 1; // currentQuantity--;
        }
    }
    public void fillUp() {
        System.out.println("I'm full");
        currentQuantity = maxQuantity;
    }

    public void fillUp(int quantityCount) {
        if (currentQuantity + quantityCount > maxQuantity) {
            System.out.println("You cannot fill up more than max quantity candies");
        } else {
            currentQuantity += quantityCount;
        }
    }

    public void fillUpOneCandy() {
        currentQuantity = currentQuantity + 1;
        if(currentQuantity + 1 > 10) {
            System.out.println("You cannot fill up more than max quantity candies");
        }
    }
    public void push(int quantityCount) {
        if (quantityCount > maxQuantity) {
            System.out.println("You cannot use more than 10 candies");
        } else {
            if (quantityCount > currentQuantity) {
                System.out.println("This quantity is not available");
            } else {
                currentQuantity = currentQuantity - quantityCount;

            }
        }

    }

}



