package seedu.addressbook.commands;

/**
 * Displays history of all commands previously entered with the most recent first.
 */
public class HistoryCommand extends Command {

    public static final String COMMAND_WORD = "history";
    public static final String MESSAGE_USAGE = "Displays history of all commands previously entered with the most recent first.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Commands History: \n";
    public static final String MESSAGE_FAILURE = "No commands previously entered. \n";

    @Override
    public CommandResult execute() {

        return new CommandResult(MESSAGE_SUCCESS);
    }
}
