package ua.ithillel.javaPro.hw4;

public class Dog extends Animal {

    private static int dogcounter;

    public Dog(String name) {
        super(name);
        dogcounter++;
    }
    public static int getDogcounter() {
        return dogcounter;
    }
    @Override
    void swim(int distance) {
        if (distance > 10) {
            System.out.println("Swim distance" + distance + "m - is to long for " + Dog.this.getName());
        } else {
            super.swim(distance);
        }
    }
    @Override
    void run(int distance) {
        if (distance > 500) {
            System.out.println("Run distance " + distance + "m - is to long for " + Dog.this.getName());
        } else {
        super.run(distance);
        }
    }
    public void move(int distanceSwim, int distanceRun) {
        System.out.println("Introducing " + getClass().getSimpleName() + " " + Dog.this.getName());
        run(distanceRun);
        swim(distanceSwim);
        System.out.println("Animals created: " + Animal.getCounter());
        System.out.println("Dogs created: " + Dog.getDogcounter());
        System.out.println('\n');
    }
}
