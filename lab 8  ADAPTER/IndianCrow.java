public class IndianCrow implements Crow{

    @Override
    public void cry() {
        System.out.println("cawing");
    }

    @Override
    public void fly() {
        System.out.println("Flying high in the mountains");
    }

    @Override
    public void eat() {
        System.out.println("eating pearls");
    }
}