package seedu.addressbook.commands;


/**
 * print goodbye message.
 */
public class GoodbyeCommand extends Command {

    public static final String COMMAND_WORD = "goodbye";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": prints goodbye message.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        return new CommandResult(
                "Goodbye World"
        );
    }
}
