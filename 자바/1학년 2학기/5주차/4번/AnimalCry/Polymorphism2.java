public class Polymorphism2 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cat(),
            new Sparrow(),
            // new Dodo(),
            // new Caw()
        };

        for(Animal x : animals){
            x.cry();
        }
    }
}