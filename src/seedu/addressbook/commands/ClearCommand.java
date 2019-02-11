package seedu.addressbook.commands;
import java.util.*;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_USAGE = "Clears address book permanently.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";
    public static final String MESSAGE_FAILURE = "Exiting clear function";


    @Override
    public CommandResult execute() {
        System.out.println("Confirm to clear the entire address book? YES to continue");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.equals("YES")) {
            addressBook.clear();
            return new CommandResult(MESSAGE_SUCCESS);
        }

        return new CommandResult(MESSAGE_FAILURE);
    }
}

