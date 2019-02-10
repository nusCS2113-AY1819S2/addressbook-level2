package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's gender in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidGender(String)}
 */
public class Gender {

    public static final String EXAMPLE = "female";
    public static final String MESSAGE_GENDER_CONSTRAINTS =
            "Person's gender should be either female or male.";
    public static final String GENDER_VALIDATION_REGEX = "[\\w+]";

    public final String value;

    /**
     * Validates given gender.
     *
     * @throws IllegalValueException if given gender string is invalid.
     */
    public Gender(String gender) throws IllegalValueException {
        String trimmedGender = gender.trim();
        if (!isValidGender(trimmedGender)) {
            throw new IllegalValueException(MESSAGE_GENDER_CONSTRAINTS);
        }
        this.value = trimmedGender;
    }

    /**
     * Returns true if the given string is a valid gender.
     */
    public static boolean isValidGender(String test) {
        return test.matches(GENDER_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Gender // instanceof handles nulls
                && this.value.equals(((Gender) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
