package Commands;

import java.util.Scanner;

public class HelpCommand<commandHelp> {
    Scanner sc = new Scanner(System.in);
    public String starterPhrase(){
        return "Для справки по доступным командам введите help: ";
    }
    String commandHelp = sc.nextLine();
    if (commandHelp == "help")){
        return "kva";
    } else {
        return "Извините, но это явно не команда help. Перезапустите программу и попробуйте снова!"; // ВЫКИНУТЬ ОШИБКУ
    }

}
