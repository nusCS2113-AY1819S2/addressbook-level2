package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
    public static final String EXAMPLE = "123456";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Postal Code should be a sequence of 6 digits.\n"
            + "Example: "
            + EXAMPLE;
    public static final String POSTAL_CODE_VALIDATION_REGEX = "^\\d{6}$";

    public final String value;

    public PostalCode(String postalCode) throws IllegalValueException {
        String trimmedPostalCode = postalCode.trim();
        if (!isValidPostalCode(trimmedPostalCode)) {
            throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
        }
        this.value = trimmedPostalCode;
    }

    public static boolean isValidPostalCode(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }
}
