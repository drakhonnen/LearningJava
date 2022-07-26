public class Dog { //this is a CLASS

    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    public void speak() {
        System.out.println("Hi! I am " + this.name + ", and I have " + this.age + " years old.");
    }

    public int get_age() {
        return this.age;
    }

    public void set_age(int age) {
        this.age = age;
    }
}
