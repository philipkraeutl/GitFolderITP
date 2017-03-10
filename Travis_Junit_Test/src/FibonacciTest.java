/**
 * Created by phili_000 on 03.03.2017.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class FibonacciTest {
        @Test
        public void evaluatesExpression() {
        Fibonacci fibonacci = new Fibonacci();
            assertEquals(13, fibonacci.calculate(7));
        }

}
