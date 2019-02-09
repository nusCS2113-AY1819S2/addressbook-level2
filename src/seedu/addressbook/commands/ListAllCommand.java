package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user, including their private information.
 */
public class ListAllCommand extends Command {

    public static final String COMMAND_WORD = "listall";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list with index numbers, " +
            "including private details.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
