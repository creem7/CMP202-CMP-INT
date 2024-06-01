
public class Main{
//    static void addNumbers(int a, int b) {
//        System.out.println(a+b);
//    }
    public static void main (String[] args) {
        //Main main = new Main();
        //addNumbers(5, 6);
        Person person = new Person();
        Animal crab = new Animal("yellowish-brown", 3.45);
        crab.Speaks();
        LandAnimal dog = new LandAnimal("brown", 35.34, "Short-haired");
        dog.move();
        dog.habitat();
        person.setName("Jane Doe");
        person.getName();
        person.displayName();System.out.println("God is good");
        Person student = new Person("Joe", "Bingham University", "12345", "BHU/23/04/10/0003");
        Person staff = new Person("David", "Bingham University", "J$$fe", 2134);
        Computer hp350 = new Computer(new RAM(), new Storage(), new Processor());
        System.out.println(hp350);

    }
}