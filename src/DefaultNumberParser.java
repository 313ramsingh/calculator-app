import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultNumberParser implements NumberParser {

    @Override
    public String[] parse(String numbers) {
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(\\[.*?\\])+\n|//.\n").matcher(numbers);
            if (matcher.find()) {
                delimiter = buildDelimiterPattern(matcher.group());
                numbers = numbers.substring(matcher.end());
            }
        }
        return numbers.split(delimiter);
    }

    private String buildDelimiterPattern(String delimitersSection) {
        Matcher matcher = Pattern.compile("\\[(.*?)]|//(.)\n").matcher(delimitersSection);
        List<String> delimiters = new ArrayList<>();
        while (matcher.find()) {
            String delimiter = matcher.group(1) != null ? matcher.group(1) : matcher.group(2);
            delimiters.add(Pattern.quote(delimiter));
        }
        return String.join("|", delimiters);
    }
}
