


public class StringCalculator implements Calculator {
    private final NumberParser parser;
    private final SumCalculator sumCalculator;

    public StringCalculator(NumberParser parser, SumCalculator sumCalculator) {
        this.parser = parser;
        this.sumCalculator = sumCalculator;
    }

    @Override
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] tokens = parser.parse(numbers);
        //System.out.println(Arrays.toString(tokens));
        return sumCalculator.sum(tokens);
    }
}
