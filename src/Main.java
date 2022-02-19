import Commands.Command;
import Commands.HelpCommand;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String [] args){
        Map<String, Command> commands = new HashMap<>();
        commands.put("help", new HelpCommand());

    }
}
