package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
    public static final String EXAMPLE = "123A";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block numbers should have 1-4 digits, " 
            + "appended with an optional character [A-Z].\n"
            + "Example: "
            + EXAMPLE;
    public static final String BLOCK_VALIDATION_REGEX = "[a-zA-Z0-9]+[a-zA-Z0-9 ]*";
    
    public final String value;
    
    public Block(String block) throws IllegalValueException {
        String trimmedBlock = block.trim();
        if (!isValidBlock(trimmedBlock)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.value = trimmedBlock;        
    }

    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }    
}
