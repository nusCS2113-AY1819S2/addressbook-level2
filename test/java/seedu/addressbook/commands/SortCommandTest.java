package seedu.addressbook.commands;

import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TestUtil;
import seedu.addressbook.util.TypicalPersons;

public class SortCommandTest {
    private static final List<ReadOnlyPerson> EMPTY_PERSON_LIST = Collections.emptyList();
    private TypicalPersons td = new TypicalPersons();
    private List<ReadOnlyPerson> sortedListWithAllTypicalPerson = Arrays.asList(td.getTypicalPersons());
    private List<ReadOnlyPerson> listWithSinglePerson = Arrays.asList(td.dan);
    private List<ReadOnlyPerson> unsortedListWithAllypicalPersons = Arrays.asList(td.candy, td.dan, td.amy, td.bill);

    /**
     * Executes the sort command for the given list and verifies it is sorted
     * the result matches the persons in the expectedPersons exactly in the same orders.
     */

    private static void assertSortBehavior(List<ReadOnlyPerson> inputPersons,
                                           List<ReadOnlyPerson> expectedPersons) {
        // create an addressbook via a new list
        AddressBook addressBook = TestUtil.createAddressBook(
                inputPersons.toArray(new Person[0]));

        SortCommand command = new SortCommand();
        command.setData(addressBook, EMPTY_PERSON_LIST);

        // addressBook is now sorted
        CommandResult result = command.execute();

        assertEquals(addressBook.getAllPersons().immutableListView(), expectedPersons);
    }

    @Test
    public void execute() throws IllegalValueException {

        // empty list: matches
        assertSortBehavior(EMPTY_PERSON_LIST, EMPTY_PERSON_LIST);

        // single item list: matches
        assertSortBehavior(listWithSinglePerson, listWithSinglePerson);

        //same name but different order: matches
        assertSortBehavior(unsortedListWithAllypicalPersons, sortedListWithAllTypicalPerson);

        // Dan Grey follow by Dan Smiths: matches
        assertSortBehavior(Arrays.asList(td.dan, td.candy, td.danGrey),
                Arrays.asList(td.candy, td.danGrey, td.dan));
    }
}
