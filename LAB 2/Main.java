class Animal{
    void hear(){

    }
}
class Cow extends Animal{
    void hear(){
        System.out.println("cow : moo");
    }
}
class Dog extends Animal{
    void hear(){
        System.out.println("dog : bark");
    }
}
class Goat extends Animal{
    void hear(){
        System.out.println("goat : meeeeee");
    }
}
class Horse extends Animal{
    void hear(){
        System.out.println("horse : hoooo");
    }
}
class Voice{
    Animal[] animals = new Animal[5];
     void preparevoide(){
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Goat();
        animals[3] = new Horse();
     }
     Void hear(){
        for(Animal animal : animals){
            animal.hear();
        }
     }
     Void templateMethod(){
        preparevoice();
        hear();
     }
}

public class Main {
    
    public static void Main(String[] args){
    Voice voice = new Voice();
    voice.templateMethod();
    }

}
