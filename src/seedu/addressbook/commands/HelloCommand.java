package seedu.addressbook.commands;


/**
 * Says hi.
 */
public class HelloCommand extends Command {
    public static final String COMMAND_WORD = "hello";
    public static final String MESSAGE_USAGE = "Says hi back to you.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Hello!!";

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
