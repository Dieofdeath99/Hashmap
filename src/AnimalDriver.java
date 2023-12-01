public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();
        Dog myDog = new Dog();
        String homework = myDog.misbehave("homework");
        System.out.println(homework);
    }
}
