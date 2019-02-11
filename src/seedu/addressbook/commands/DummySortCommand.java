package seedu.addressbook.commands;

import java.util.HashSet;
import java.util.Set;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList;
import seedu.addressbook.data.tag.Tag;

/**
 * Adds a person to the address book.
 */
public class DuummySortCommand extends Command {

    public static final String COMMAND_WORD = "dummysort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Psuedo sorts contacts in the address book in alphabetical order.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book is sorted in alphabetical order! ^^";

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
