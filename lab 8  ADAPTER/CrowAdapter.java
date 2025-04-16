public class CrowAdapter implements Swan{

    private Crow crow;
    public CrowAdapter(Crow c){
        this.crow = c;
    }

    @Override
    public void sing() {
        crow.cry();
    }

    @Override
    public void swim() {
        crow.fly();
    }

    @Override
    public void eat() {
        crow.eat();
    }
}
