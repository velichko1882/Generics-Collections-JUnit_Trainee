package by.epamlab.validators;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public boolean validationOfData(Integer data) {
        if ((data >= 1 && data <= 10) || (data >= 15 && data <=30)){
            return true;
        }
        return false;
    }
}
