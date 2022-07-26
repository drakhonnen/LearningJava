public class Main {
    
    public static void main(String[] args) {

        Dog tim = new Dog("Tim", 3); //calling and giving the parameters to the dog method
        tim.speak(); //calling the speaking method
        Dog nico = new Dog("Nico", 2);
        nico.speak();
        Dog seb = new Dog("Seb", 10);
        seb.speak();
        Dog yut = new Dog("Yut", 11);
        yut.speak();
        Dog bob = new Dog("Bob", 14);
        bob.speak();

        int x = tim.get_age();
        System.out.println(x);

        tim.set_age(10);
        tim.speak();

        System.out.println("-------------------");
        System.out.println("CAT class");
        System.out.println("");

        Cat plume = new Cat("Plume", 9, 300);
        plume.speak();

        Cat york = new Cat("York", 3);
        york.speak();

        Cat hill = new Cat("Hill");
        hill.speak();
    }
}
