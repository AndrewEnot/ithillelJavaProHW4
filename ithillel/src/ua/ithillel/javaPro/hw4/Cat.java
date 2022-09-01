package ua.ithillel.javaPro.hw4;

public class Cat extends Animal {

    private static int catcounter;

    public Cat(String name) {
        super(name);
        catcounter++;
    }
    public static int getCatcounter() {
        return catcounter;
    }
    @Override
    void swim(int distance) {
        System.out.println(Cat.this.getName() + " cannot swim :(");
    }
    @Override
    void run(int distance) {
        if (distance > 200) {
            System.out.println("Distance " + distance + "m - is to long for " + Cat.this.getName());
        } else {
            super.run(distance);
        }
    }
    public void move(int distanceSwim, int distanceRun) {
        System.out.println("Introducing " + getClass().getSimpleName() + " " + Cat.this.getName());
        run(distanceRun);
        swim(distanceSwim);
        System.out.println("Animals created: " + Animal.getCounter());
        System.out.println("Cats created: " + Cat.getCatcounter());
        System.out.println('\n');
    }
}
