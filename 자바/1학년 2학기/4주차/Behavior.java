public class Behavior{
    public static interface IAnimal {
	void eat();
    }
    public static class Human implements IAnimal {
	    public void eat() {
		System.out.println("use spoon and chopstick");
	    }
	    public void think() {
		System.out.print("thinking");
	    }
    }
    public static void main(String[] args){
        Human h1 = new Human();
	h1.eat();
    	h1.think();
        
    	IAnimal h2 = new Human();
	h2.eat();
	h2.think(); //Error
    }
}