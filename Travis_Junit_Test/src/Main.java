/**
 * Created by phili_000 on 03.03.2017.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class Main {
    public static void main(String[] args){
            Result result = JUnitCore.runClasses(FibonacciTest.class);
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }

            if(result.wasSuccessful()){
                System.out.println("The JUnit Test was successful!");
            }

    }
}
