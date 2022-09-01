package ua.ithillel.javaPro.hw4;


public class Animal {

    private final String name;
    private static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }
    void run(int distance) {
        System.out.println(this.name + " ran " + distance + " m...>");
    }
    void swim(int distance) {
        System.out.println(this.name + " swam " + distance + " m...>");
    }
    public String getName() {
        return name;
    }
    public static int getCounter() {
        return counter;
    }
}