package by.epamlab.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator implements Validator<String> {

    private final String regex = "[A-Z].{0,14}";

    @Override
    public boolean validationOfData(String data) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
