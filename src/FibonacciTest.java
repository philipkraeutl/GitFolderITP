/**
 * Created by phili_000 on 17.03.2017.
 */
    import static org.junit.Assert.assertEquals;
import org.junit.Test;
    public class FibonacciTest {
        @Test
        public void evaluatesExpression() {
            Fibonacci fibonacci = new Fibonacci();
            int sum = fibonacci.calculate(7);
            assertEquals(13, sum);
        }

    }


