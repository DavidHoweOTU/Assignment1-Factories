/**
 * XboxSeriesX is an implementation of the
 * {@link GameConsole} interface which returns information
 * about the Xbox Series X console.
 *
 * @author  David Howe
 * @since   1.0
 */
public class XboxSeriesX implements GameConsole {

    /**
     * {@inheritDoc}
     */
    @Override
    public void bootUpMessage() {
        System.out.print("Xbox Series X: This is where the fun begins.");
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
        return 599.99f;
    }
}
