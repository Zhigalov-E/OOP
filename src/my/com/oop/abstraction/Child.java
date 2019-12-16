package my.com.oop.abstraction;


public class Child extends Person {

    @Override
    void move() {
        System.out.println("Crawled.");
    }

    @Override
    void talk() {
        System.out.println("Gurgled.");
    }
}
