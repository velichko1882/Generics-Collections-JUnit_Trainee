package by.epamlab;

import by.epamlab.exceptions.ValidationFailedException;
import by.epamlab.types.Person;
import by.epamlab.validators.IntegerValidator;
import by.epamlab.validators.PersonValidator;
import by.epamlab.validators.StringValidator;
import by.epamlab.validators.Validator;

import java.util.HashMap;
import java.util.Map;

public class ValidationSystem {

    public static Map<String, Validator> validators = new HashMap<>();

    static {
        validators.put(Integer.class.getName(), new IntegerValidator());
        validators.put(String.class.getName(), new StringValidator());
        validators.put(Person.class.getName(), new PersonValidator());
    }

    public static <T> void validate (T data) throws ValidationFailedException{
        String dataType = data.getClass().getName();
        Validator validator = validators.get(dataType);
        if (validator == null){
            throw new ValidationFailedException("Such a validator does not exist.");
        }
        if (validator.validationOfData(data)){
            System.out.println("Data is valid.");
        } else {
            throw new ValidationFailedException("Data is invalid");
        }
    }

}
