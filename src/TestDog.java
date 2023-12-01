import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestDog {
    @Test
    public void testMakeSound() {
        Dog dog = new Dog();
        assertEquals("Bark", dog.makeSound());
    }
    @Test
    public void testMove() {
        Dog dog = new Dog();
        assertEquals("I'm running!", dog.move());
    }
    @Test
    public void testMisbehave() {
        Dog dog = new Dog();
        assertEquals("I chewed up your homework", dog.misbehave("homework"));
    }
}
