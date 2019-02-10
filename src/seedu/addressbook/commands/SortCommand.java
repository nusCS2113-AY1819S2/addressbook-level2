package seedu.addressbook.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
import com.sun.javafx.collections.MappingChange.Map;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList.DuplicatePersonException;

public class SortCommand extends Command{
    public static final String COMMAND_WORD = "Sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sort all persons in the address book by their name.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = null;
		try {
			allPersons = addressBook.getSortedPersons().immutableListView();
		} catch (DuplicatePersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }


	
    
}
