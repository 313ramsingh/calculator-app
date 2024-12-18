
public class DefaultNumberParser implements NumberParser {

    @Override
    public String[] parse(String numbers) {
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbers = numbers.substring(delimiterEnd + 1);
        }
        return numbers.split(delimiter);
    }
}
