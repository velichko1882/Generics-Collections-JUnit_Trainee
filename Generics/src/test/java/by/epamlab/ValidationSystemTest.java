package by.epamlab;

import by.epamlab.exceptions.ValidationFailedException;
import by.epamlab.types.Person;
import org.junit.Test;

public class ValidationSystemTest {

    @Test
    public void testValidateInt() throws ValidationFailedException {
        ValidationSystem.validate(1);
        ValidationSystem.validate(5);
        ValidationSystem.validate(10);
        ValidationSystem.validate(15);
        ValidationSystem.validate(20);
        ValidationSystem.validate(30);
    }

    @Test (expected = ValidationFailedException.class)
    public void testValidateIntFail() throws ValidationFailedException {
        ValidationSystem.validate(114);
    }

    @Test
    public void testValidateString() throws ValidationFailedException {
        ValidationSystem.validate("F123");
        ValidationSystem.validate("L");
        ValidationSystem.validate("FEjkl;'zvc/23 r");
    }

    @Test (expected = ValidationFailedException.class)
    public void testValidateStringFail() throws ValidationFailedException {
        ValidationSystem.validate("kjjjjjj");
    }

    @Test
    public void testValidatePerson() throws ValidationFailedException {
        ValidationSystem.validate(new Person(17, 161));
        ValidationSystem.validate(new Person(16, 170));
    }

    @Test (expected = ValidationFailedException.class)
    public void testValidatePersonFail() throws ValidationFailedException {
        ValidationSystem.validate(new Person(15, 161));
    }

}