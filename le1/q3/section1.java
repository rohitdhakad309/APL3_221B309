class mother{
    void show(){
        System.out.println("mother");
    }
}
class child extends mother{
    void show(){
        System.out.println("child");
    }
}
public class section1 {
    public static void main(String[] args) {
        mother m1 = new child();
        m1.show(); //calling child show()
        
    }

    
}