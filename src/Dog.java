public class Dog implements Animal, Devilish {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    @Override
    public void move() {
        System.out.println("I'm running!");
    }
    @Override
    public String misbehave(String item) {
        return "I chewed up your " + item;
    }
}
