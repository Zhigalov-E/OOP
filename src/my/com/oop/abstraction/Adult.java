package my.com.oop.abstraction;


public class Adult extends Person {

    @Override
    void move() {
        System.out.println("Walked.");
    }

    @Override
    void talk() {
        System.out.println("Spoke.");
    }
}
