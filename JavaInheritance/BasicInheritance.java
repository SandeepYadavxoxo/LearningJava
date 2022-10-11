package JavaInheritance;
class Animal {

    String name;
    public void eat() {
        System.out.println("eat Method from Parent Animal Class");
    }
}

class Dog extends Animal {

    public void display() {
        System.out.println("Display method from Child Dog Class " + name);
    }
}
public class BasicInheritance {
    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.name = "Sandeep";
        labrador.display();

        labrador.eat();
    }

}
