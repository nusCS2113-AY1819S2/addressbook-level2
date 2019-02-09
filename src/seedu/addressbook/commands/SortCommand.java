package seedu.addressbook.commands;

// Sort by Name

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Rearrange current list by their name in ascending alphabetical order"
                                                +"\nExample: sort";

    public static final String MESSAGE_SUCCESS = "Address book has been sorted!";

    @Override
    public CommandResult execute() {
        addressBook.sort();
        return new CommandResult(MESSAGE_SUCCESS);
    }


}
