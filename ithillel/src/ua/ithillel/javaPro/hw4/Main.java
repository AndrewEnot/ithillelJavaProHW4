package ua.ithillel.javaPro.hw4;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mishanja");
        cat1.move(5,150);

        Dog dog1 = new Dog("Vasjko");
        dog1.move(5,100);

        Dog dog2 = new Dog("Mircha");
        dog2.move(30,600);

        Cat cat2 = new Cat("Apostol");
        cat2.move(50,250);
    }
}
