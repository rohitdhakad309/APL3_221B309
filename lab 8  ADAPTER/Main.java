public class Main {
    public static void main(String[] args) {
        Crow crow = new IndianCrow();
        CrowAdapter ca = new CrowAdapter(crow);
        client(ca);

    }
    public static void client(Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}