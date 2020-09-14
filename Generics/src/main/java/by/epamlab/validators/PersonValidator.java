package by.epamlab.validators;

import by.epamlab.types.Person;

public class PersonValidator implements Validator<Person> {

    @Override
    public boolean validationOfData(Person data) {
        if (data.getAge() >= 16 && data.getHeight() > 160){
            return true;
        }
        return false;
    }
}
