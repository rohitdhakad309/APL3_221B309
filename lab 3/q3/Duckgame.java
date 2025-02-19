package q3;

public class Duckgame {

    
}
interface Swimable {
    void swim();
}
interface Flyable {
    void fly();
}
interface Quackable {
    void quack();
}
class LakeDuck implements Swimable, Flyable, Quackable {
    public void swim() {
        System.out.println("Lake Duck swims.");
    }
    public void fly() {
        System.out.println("Lake Duck flies.");
    }
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}
class RedHeadDuck implements Swimable, Flyable, Quackable {
    public void swim() {
        System.out.println("RedHead Duck swims.");
    }
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}
class WoodenDuck implements Swimable {
    public void swim() {
        System.out.println("Wooden Duck swims.");
    }
}
public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();
        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}



















