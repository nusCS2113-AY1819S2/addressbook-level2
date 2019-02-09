package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.Phone;
import java.util.*;
import java.lang.String;

public class FindByPhoneCommand extends Command{
    public static final String COMMAND_FIND_BY_PHONE_WORD = "findp";
    public static final String MESSAGE_USAGE = COMMAND_FIND_BY_PHONE_WORD + ": Finds all persons whose phone number matches "
            + "the specified phone number and displays them as a list with index numbers.\n"
            + "Parameters: PHONE NUMBER...\n"
            + "Example: " + COMMAND_FIND_BY_PHONE_WORD + " 12345678";

    private final String phone;
    public FindByPhoneCommand(String phone){this.phone = phone;}


    @Override
    public CommandResult execute() {
        final List<ReadOnlyPerson> personsFound = getPersonsWithPhone(phone);
        return new CommandResult(getMessageForPersonListShownSummary(personsFound), personsFound);
    }

    private List<ReadOnlyPerson> getPersonsWithPhone(String phone) {
        final List<ReadOnlyPerson> matchedPersons = new ArrayList<>();
        for (ReadOnlyPerson person : addressBook.getAllPersons()) {
            if (person.getPhone().value.equals(phone)) {
                matchedPersons.add(person);
            }
        }
        return matchedPersons;
    }

}
