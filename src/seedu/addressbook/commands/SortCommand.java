package seedu.addressbook.commands;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

/**
 * Lists all persons in the address book to the user in a sorted order from capital [A-Z] to lower capital [a-z].
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list with index numbers\n"
            + " in a sorted order from capital [A-Z] to lower capital [a-z]\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        allPersons = addressBook.sortPersons(allPersons);
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
