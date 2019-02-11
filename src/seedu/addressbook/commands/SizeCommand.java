package seedu.addressbook.commands;

/**
 * Shows help instructions.
 */
public class SizeCommand extends Command {

    public static final String COMMAND_WORD = "size";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Show the size of the address book.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        if (addressBook.size() == 0)
            return new CommandResult("There is no person in the address book.");
        else if (addressBook.size() == 1)
            return new CommandResult("There is one person in the address book.");
        else return new CommandResult("There are " + addressBook.size() + " persons in the address book.");
    }
}