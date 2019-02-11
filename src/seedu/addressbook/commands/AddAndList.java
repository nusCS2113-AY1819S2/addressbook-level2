package seedu.addressbook.commands;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.Tag;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddAndList extends Command{

    /**
     * Adds a person to the address book.
     */

        public static final String COMMAND_WORD = "addAndList";

        public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a person to the address book, and see people already in it. "
                + "Contact details can be marked private by prepending 'p' to the prefix.\n"
                + "Parameters: NAME [p]p/PHONE [p]e/EMAIL [p]a/ADDRESS  [t/TAG]...\n"
                + "Example: " + COMMAND_WORD
                + " John Doe p/98765432 e/johnd@gmail.com a/311, Clementi Ave 2, #02-25 t/friends t/owesMoney";

        public static final String MESSAGE_DUPLICATE_PERSON = "This person already exists in the address book";

        private final Person toAdd;


        /**
         * Convenience constructor using raw values.
         *
         * @throws IllegalValueException if any of the raw values are invalid
         */
        public AddAndList(String name,
                          String phone, boolean isPhonePrivate,
                          String email, boolean isEmailPrivate,
                          String address, boolean isAddressPrivate,
                          Set<String> tags) throws IllegalValueException {
            final Set<Tag> tagSet = new HashSet<>();
            for (String tagName : tags) {
                tagSet.add(new Tag(tagName));
            }
            this.toAdd = new Person(
                    new Name(name),
                    new Phone(phone, isPhonePrivate),
                    new Email(email, isEmailPrivate),
                    new Address(address, isAddressPrivate),
                    tagSet
            );
        }

        public AddAndList(Person toAdd) {
            this.toAdd = toAdd;
        }

        public ReadOnlyPerson getPerson() {
            return toAdd;
        }

        @Override
        public CommandResult execute() {
            try {
                addressBook.addPerson(toAdd);
                List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
                return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
            } catch (UniquePersonList.DuplicatePersonException dpe) {
                return new CommandResult(MESSAGE_DUPLICATE_PERSON);
            }
        }

    }



