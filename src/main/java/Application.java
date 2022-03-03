/**
 * An application class used to test {@link GameConsoleFactory}.
 *
 * @see     GameConsole
 * @see     NintendoSwitch
 * @see     PlayStationFive
 * @see     XboxSeriesX
 * @author  David Howe
 * @since   1.0
 */
public class Application {
    public static void main(String[] args) {
        // Create instances of each game console type
        GameConsole nintendo    = GameConsoleFactory.getGameConsole("Switch");
        GameConsole playstation = GameConsoleFactory.getGameConsole("PlayStation");
        GameConsole xbox        = GameConsoleFactory.getGameConsole("Xbox");

        // Output information to system console
        nintendo.bootUpMessage();
        System.out.printf(" | GameType='%s' | Price: $%.2f\n", nintendo.gameType(), nintendo.getPrice());

        playstation.bootUpMessage();
        System.out.printf(" | GameType='%s' | Price: $%.2f\n", playstation.gameType(), playstation.getPrice());

        xbox.bootUpMessage();
        System.out.printf(" | GameType='%s' | Price: $%.2f\n", xbox.gameType(), xbox.getPrice());
    }
}
