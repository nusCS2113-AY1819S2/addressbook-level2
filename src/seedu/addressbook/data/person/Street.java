package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    public static final String EXAMPLE = "Alpha Ave 3";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Street names should contain at least one character. " 
            + "Only alphanumeric characters are allowed."
            + "Example: "
            + EXAMPLE;
    public static final String STREET_VALIDATION_REGEX = "[a-zA-Z0-9][a-zA-Z0-9 ]+";

    public final String value;

    public Street(String street) throws IllegalValueException {
        String trimmedStreet = street.trim();
        if (!isValidStreet(trimmedStreet)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.value = trimmedStreet;
    }

    public static boolean isValidStreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }
}
