package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; 
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #12-345, 123456";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Address has incorrect no. of entry fields.\n"
            + "Address should have 4 entry fields: " 
            + "a/BLOCK, STREET, UNIT, POSTAL_CODE\n"
            + "Example: "
            + EXAMPLE;
    public final String value;
    
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String[] splitAddress = address.split(",");
        
        if (splitAddress.length != 4) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        this.block = new Block(splitAddress[0].trim());
        this.street = new Street(splitAddress[1].trim());
        this.unit = new Unit(splitAddress[2].trim());
        this.postalCode = new PostalCode(splitAddress[3].trim());
        
        String formatAddress = String.format("%s, %s, %s, %s", block.value, street.value, unit.value, postalCode.value);
        
        this.isPrivate = isPrivate;

        this.value = formatAddress;
    }

    /**
     * Returns true if a given string is a valid person address.
     */

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
