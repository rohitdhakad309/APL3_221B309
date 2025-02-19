package lab3.q2;

public interface Testable {
    void display();
}
public class Test implements Testable {
    public void display() {
        System.out.println("Displaying Test object!");
    }
    
}

public abstract class AbsTest implements Testable {
}

public class ConcreteTest extends AbsTest {
    public void display() {
        System.out.println("Displaying ConcreteTest object!");
    }
    
}
