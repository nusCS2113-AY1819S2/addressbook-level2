package seedu.addressbook.commands;

/**
 * Clears the address book.
 */
public class HappyCNY extends Command {

    public static final String COMMAND_WORD = "HappyCNY";
    public static final String MESSAGE_USAGE = "It is not CNY.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book is greeting you!";

    public HappyCNY() {
 //       addressBook.greetCNY();
       System.out.println("Happy Chinese New Year!!! Have you done your homework???");
    }

    @Override
    public CommandResult execute() {

        return new CommandResult(MESSAGE_SUCCESS);
    }
}
