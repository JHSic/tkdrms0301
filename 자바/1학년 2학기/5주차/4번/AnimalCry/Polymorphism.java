public class Polymorphism{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal sparrow = new Sparrow();

        cat.cry();
        sparrow.cry();
    }
}