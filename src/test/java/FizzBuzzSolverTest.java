import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzSolverTest {

    @Test
    public void getFizzBuzzResult() {
        List<String> result = FizzBuzzSolver.getFizzBuzzResult(100);
        assertEquals("Fizz", result.get(3 - 1));
        assertEquals("Buzz",result.get(5 - 1));
        assertEquals("FizzBuzz",result.get(15 - 1));
    }
}