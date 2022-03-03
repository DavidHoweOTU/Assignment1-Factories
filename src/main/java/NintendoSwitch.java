/**
 * NintendoSwitch is an implementation of the
 * {@link GameConsole} interface which returns information
 * about the Nintendo Switch console.
 *
 * @author  David Howe
 * @since   1.0
 */
public class NintendoSwitch implements GameConsole {

    /**
     * {@inheritDoc}
     */
    @Override
    public void bootUpMessage() {

        System.out.print("Welcome to Nintendo Switch!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String gameType() {
        return "Cartridge";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getPrice() {
        return 379.99f;
    }
}
