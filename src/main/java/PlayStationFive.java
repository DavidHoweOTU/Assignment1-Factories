/**
 * PlayStationFive is an implementation of the
 * {@link GameConsole} interface which returns information
 * about the PlayStation 5 console.
 *
 * @author  David Howe
 * @since   1.0
 */
public class PlayStationFive implements GameConsole {

    /**
     * {@inheritDoc}
     */
    @Override
    public void bootUpMessage() {
        System.out.print("Elevate your gameplay with PlayStation 5");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String gameType() {
        return "Disc";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getPrice() {
        return 629.99f;
    }
}
