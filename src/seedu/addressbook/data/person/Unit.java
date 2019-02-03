package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
    public static final String EXAMPLE = "#12-345";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit numbers should be in the following format: "
            + "#XXX-XXX (X is any digit 0-9)\n"
            + "Example: "
            + EXAMPLE;
    public static final String UNIT_VALIDATION_REGEX = "#\\d+-\\d+";

    public final String value;

    public Unit(String unit) throws IllegalValueException {
        String trimmedUnit = unit.trim();
        if (!isValidUnit(trimmedUnit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = trimmedUnit;
    }

    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }
}
