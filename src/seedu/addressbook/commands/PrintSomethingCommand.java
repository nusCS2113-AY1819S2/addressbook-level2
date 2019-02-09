package seedu.addressbook.commands;

/**
 * Prints something random.
 */

public class PrintSomethingCommand extends Command {

    public static final String COMMAND_WORD = "print";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Prints something random\n" + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "Something random has been printed!";

    @Override
    public CommandResult execute() {
        System.out.println("Hello World!!");
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
