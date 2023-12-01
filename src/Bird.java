public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
    @Override
    public void move() {
        System.out.println("I am flying");
    }
}

