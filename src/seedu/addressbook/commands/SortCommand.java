package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;
import java.util.*;

/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list with index numbers in sorted order.\n"
            + ": Displays in capital A-Z followed by lower capital a-z.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        if(allPersons.size()!=0){
/*            Collections.sort(allPersons,new Comparator<>() {
                public int compare(ReadOnlyPerson left, ReadOnlyPerson right) {
                    return left.getName().toString().compareTo(right.getName().toString());
                }
            });*/
        }
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }

/*    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> sortedToBeDisplayed = addressBook.getAllPersons().immutableListView();

        Collections.sort(sortedToBeDisplayed, (left, right) -> left.getName().toString().compareTo(right.getName().toString()));

*//*        Comparator<ReadOnlyPerson> comparator = new Comparator<ReadOnlyPerson>() {
            @Override
            public int compare(ReadOnlyPerson left, ReadOnlyPerson right) {
                return left.getName().toString().compareTo(right.getName().toString()); // use your logic
            }
        };

        Collections.sort(sortedToBeDisplayed,comparator);*//*
        return new CommandResult( getMessageForPersonListShownSummary(sortedToBeDisplayed),sortedToBeDisplayed);


    }*/
}
