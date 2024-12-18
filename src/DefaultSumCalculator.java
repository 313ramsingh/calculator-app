
import java.util.ArrayList;
import java.util.List;

public class DefaultSumCalculator implements SumCalculator {

    @Override
    public int sum(String[] numbers) {
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        for (String token : numbers) {
            int num = Integer.parseInt(token);
            if (num < 0) {
                negatives.add(num);
            } else if (num <= 1000) {
                sum += num;
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }
        return sum;
    }
}
