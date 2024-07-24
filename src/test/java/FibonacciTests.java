import org.faria.fibonacci.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTests {
    private Fibonacci fib;
    @BeforeEach
    public void setup() {
        fib = new Fibonacci();
    }

    @Test
    public void isFib() {
        Assertions.assertTrue(fib.isFibonacci(5));
    }

    @Test
    public void checkPos() {
        Assertions.assertEquals(4,fib.positionOf(3));
    }

    @Test
    public void getGoldenRatioTo() {
        Assertions.assertEquals(1.5,fib.getGoldenRatioUntil(5));
    }
}
