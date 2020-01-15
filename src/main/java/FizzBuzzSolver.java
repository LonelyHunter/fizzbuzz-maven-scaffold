import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolver {

    public static List<String> getFizzBuzzResult(Integer num) {
        List<String> returnArray = new ArrayList<>(num);

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                returnArray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                returnArray.add("Fizz");
            } else if (i % 5 == 0) {
                returnArray.add("Buzz");
            } else {
                returnArray.add(String.valueOf(i));
            }
        }
        return returnArray;
    }

}
