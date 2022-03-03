/**
 * GameConsole is an interface class used to
 * define the common methods used by game
 * console classes.
 *
 * @author  David Howe
 * @since   1.0
 */
public interface GameConsole {
    /**
     * Prints out the contents of a simple
     * message that might appear on the boot
     * screen of the console. Not accurate to
     * the real console, just used for
     * demonstration purposes.
     */
    void bootUpMessage();

    /**
     * Provides the type of hardware used to
     * read a game by the console.
     * @return {@code String} containing the game storage type.
     */
    String gameType();

    /**
     * Provides the standard price in CAD for
     * the console (as of March 2022).
     * @return {@code float} containing the price of the console.
     */
    float getPrice();
}
