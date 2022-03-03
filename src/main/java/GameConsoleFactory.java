/**
 * GameConsoleFactory is a factory class used to generate
 * {@link GameConsole} implementations.
 *
 * @see NintendoSwitch
 * @see PlayStationFive
 * @see XboxSeriesX
 * @author  David Howe
 * @since   1.0
 */
public class GameConsoleFactory {

    /**
     * Generates a new {@link GameConsole} implementation based on the
     * specified console type.
     * @param consoleType   the type of console to be generated
     * @return              {@link NintendoSwitch} if {@code consoleType} is "Switch";
     *                      {@link PlayStationFive} if {@code consoleType} is "PlayStation";
     *                      {@link XboxSeriesX} if {@code consoleType} is "Xbox";
     *                      {@code null} otherwise.
     */
    public static GameConsole getGameConsole(String consoleType) {
        return switch (consoleType) {
            case "Switch"       -> new NintendoSwitch();
            case "PlayStation"  -> new PlayStationFive();
            case "Xbox"         -> new XboxSeriesX();
            default             -> null;
        };
    }
}
