package seedu.addressbook.commands;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Displays history of all commands previously entered with the most recent first.
 */
public class HistoryCommand extends Command {

    public static final String COMMAND_WORD = "history";
    public static final String MESSAGE_USAGE = "Displays history of all commands previously entered with the most recent first.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Commands History: \n";
    public static final String MESSAGE_FAILURE = "No commands previously entered. \n";
    
    private ArrayList<String> commandHistory;

    public HistoryCommand(ArrayList<String> commandHistory) {
        this.commandHistory = commandHistory;
    }
    
    @Override
    public CommandResult execute() {
        if (!commandHistory.isEmpty()) {
            Collections.reverse(commandHistory);
            return new CommandResult(MESSAGE_SUCCESS + String.join("\n", commandHistory));
        }
        return new CommandResult(MESSAGE_FAILURE);
    }
}
