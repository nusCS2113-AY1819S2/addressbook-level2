package seedu.addressbook.commands;


public class Hello extends Command {

    public static final String COMMAND_WORD = "hello";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": prints hello World!";




    public CommandResult execute() {
        return new CommandResult(
                "hello World!");
    }
}
