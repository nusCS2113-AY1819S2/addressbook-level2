package seedu.addressbook.commands;

/**
 * Shows help instructions.
 */
public class JunkCommand extends Command {

    public static final String COMMAND_WORD = "junk";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": THIS IS A LINE OF UNNECESSARY JUNK. YOU JUST WASTED 1 MIN OF YOUR LIFE =)\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        return new CommandResult(
                JunkCommand.MESSAGE_USAGE
                        + "\n"
        );
    }
}