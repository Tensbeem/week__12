import javax.xml.namespace.QName;

class Animal {
    protected String name;
    protected eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    public void bark(){
        System.out.println("It can bark");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat cat food");
    }
    public void meow(){
        System.out.println("It can meow");
    }
}

class Mobile{
    //states
    public String color = "white";
    public int price = 1_000;

    //behavior
    public void calling(){
        System.out.println("Wait,it's connecting");
    }
    public void masseging(){
        System.out.println("You can send messages");
    }
}

public class Main {
    public static void main(String[] args) {
        //insatance objext
        Mobile obj = new Mobile();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Bool";
        dog.display();
        dog.eat();
        dog.bark();

        cat.name = "Kamui";
        cat.display();
        cat.eat();
        cat.meow();

        obj.calling();
        obj.masseging();
        System.out.println(obj.color);
        System.out.println(obj.price);
    }
}