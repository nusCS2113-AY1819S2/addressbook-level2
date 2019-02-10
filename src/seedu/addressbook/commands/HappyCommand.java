package seedu.addressbook.commands;

/**
 * Prints a message that makes you happy.
 * Makes the addressbook contain a sense of humour.
 */
public class HappyCommand extends Command {

    public static final String COMMAND_WORD = "happy";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Prints a message that makes you happy.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_HAPPY = "Stressed? Follow me and say \"hahaha\"! Do you feel happier? Yay!\n";

    @Override
    public CommandResult execute() {
        return new CommandResult(
                MESSAGE_HAPPY
        );
    }
}