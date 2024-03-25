package classroom;

public class ElectroCar {

    private String modelName;
    private String color;
    private  final int MAX_ENERGY = 4;
    private  int currentEnergy;

    public ElectroCar(String modelName, String color) {
        this.modelName = modelName;
        this.color = color;
        this.currentEnergy = MAX_ENERGY;
    }

    public ElectroCar() {
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    @Override
    public String toString() {
        return "ElectroCar{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    // Task 1: Create Method with name: drive that will decrement energy for 1;

    public void drive() {
       if (getCurrentEnergy() <=  0) {
            System.out.println("Not enough energy. Charge me!");
        } else {
            System.out.println("Drive");
            currentEnergy--;
        }
    }
    // Task Method Charge that will restore energy.
    public void charge() {
        currentEnergy = MAX_ENERGY;
        System.out.println("Energy is full");
    }
    // Method overloading;
    // Task 3: create method drive that will accept energy count and decrement accordinaly;

    public void drive(int energyCount) {
        if (energyCount > MAX_ENERGY) {
            System.out.println("Energy count cannot be greater than max energy");
        } else {
           if (currentEnergy + energyCount < 0) {
               currentEnergy = currentEnergy - energyCount;
           }

        }
    }
    // Create Method with name charge that accepts energy count;
    public void charge (int energyCount) {
        if (energyCount > MAX_ENERGY) {
            System.out.println("Energy count is more than max energy");
        } else {
            if (currentEnergy + energyCount > MAX_ENERGY) {
                System.out.println("Cant charge");
            } else {
                currentEnergy = currentEnergy + energyCount;
            }
        }

        }
    }
