package seedu.addressbook.commands;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Prints date and time at exact moment when user enters "clock" command.
 */
public class ClockCommand extends Command {
    public static final String COMMAND_WORD = "clock";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Prints date and time in format: day, date-month-year at hr:min:sec AM/PM timezone.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, dd-MM-yyyy 'at' hh:mm:ss a z");
        //System.out.println("Date & Time now: " + dateFormatter.format(now));
        return new CommandResult("Date & Time now: " + dateFormatter.format(now));
    }
}