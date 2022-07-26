public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 100;
    }
    public Cat(String name) {
        super(name, 0);
        this.food = 100;
    }

    public void speak() {
        if (age > 0 && food != 100) {
            System.out.println("Meoow my name is " + this.name + ", I am " + this.age + " years old, and I get fed " + this.food + " grams per day.");
        }
        else if (age > 0 && food == 100) {
            System.out.println("Meoow my name is " + this.name + ", I am " + this.age + " years old.");
        }
        else if (age == 0) {
            System.out.println("Meoow my name is " + this.name + "!");
        }
    }
    
}
