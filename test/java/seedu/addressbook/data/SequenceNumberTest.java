package seedu.addressbook.data;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;

public class SequenceNumberTest {

    private Person init;
    private Person adam;
    private Person ben;
    private Person charlie;
    private Person daisy;

    private AddressBook defaultAddressBook;

    @Before
    public void setUp() throws Exception {
        
        init    = new Person(new Name("Init"),
                new Phone("91235468", false),
                new Email("adam@nushackers.org", false),
                new Address("8 Computing Drive, Singapore", false),
                Collections.emptySet());
        
        init.setNextSequenceNumber(1);

        adam     = new Person(new Name("Adam"),
                new Phone("91235468", false),
                new Email("adam@nushackers.org", false),
                new Address("8 Computing Drive, Singapore", false),
                Collections.emptySet());

        ben     = new Person(new Name("Ben"),
                new Phone("94321500", false),
                new Email("ben@nusgreyhats.org", false),
                new Address("9 Computing Drive", false),
                Collections.emptySet());

        charlie = new Person(new Name("Charlie"),
                new Phone("98751365", false),
                new Email("charlie@nusgdg.org", false),
                new Address("10 Science Drive", false),
                Collections.emptySet());

        daisy    = new Person(new Name("Daisy"),
                new Phone("84512575", false),
                new Email("daisy@nuscomputing.com", false),
                new Address("11 Arts Link", false),
                Collections.emptySet());

        defaultAddressBook = new AddressBook();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add_and_delete_sequenceNumberCheck() throws Exception {
        defaultAddressBook.addPerson(adam);
        assertEquals(1, adam.getSequenceNumber());
        defaultAddressBook.addPerson(ben);
        assertEquals(2, ben.getSequenceNumber());
        defaultAddressBook.addPerson(charlie);
        assertEquals(3, charlie.getSequenceNumber());
        defaultAddressBook.removePerson(ben);
        defaultAddressBook.addPerson(daisy);
        assertEquals(4, daisy.getSequenceNumber());
    }
}
