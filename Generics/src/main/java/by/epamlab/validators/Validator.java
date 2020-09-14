package by.epamlab.validators;

public interface Validator<T> {

    boolean validationOfData(T data);
}
