import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBird {
    @Test
    public void testMakeSound() {
        Bird bird = new Bird();
        assertEquals("Chirp", bird.makeSound());
    }
    @Test
    public void testMove() {
        Bird bird = new Bird();
        assertEquals("I am flying", bird.move());
    }
}